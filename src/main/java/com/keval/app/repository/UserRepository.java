package com.keval.app.repository;

import com.keval.app.generated.tables.pojos.User;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.keval.app.generated.Tables.USER;
import static org.jooq.impl.DSL.asterisk;

@Repository
public class UserRepository {

    private DSLContext dslContext;

    public UserRepository(Configuration configuration) {
        this.dslContext = configuration.dsl();
    }

    public List<User> getAllUsers() {
        return dslContext.select(asterisk())
                .from(USER)
                .fetchInto(User.class);
    }
}
