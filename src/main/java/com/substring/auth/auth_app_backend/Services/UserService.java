package com.substring.auth.auth_app_backend.Services;

import com.substring.auth.auth_app_backend.dtos.UserDto;

public interface UserService
{
    //Create User
    UserDto createdUser(UserDto userDto);

    //Get User by Email
    UserDto getUserByEmail(String email);

    //Update User
    UserDto updateUser(UserDto userDto, String userId);

    //Delete User
    void deletUser(String userId);

    //Get UserBy Id
    UserDto getUserById(String userId);

    //Get all User
    Iterable<UserDto>getAllUsers();
}
