package com.dellahi.buyAny.Repository;

import com.dellahi.buyAny.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
