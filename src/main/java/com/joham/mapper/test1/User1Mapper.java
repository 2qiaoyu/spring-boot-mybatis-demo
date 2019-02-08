package com.joham.mapper.test1;

import com.joham.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author joham
 */
@Repository
public interface User1Mapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}
