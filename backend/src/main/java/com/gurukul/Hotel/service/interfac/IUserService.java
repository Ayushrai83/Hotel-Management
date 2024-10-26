package com.gurukul.Hotel.service.interfac;

import com.gurukul.Hotel.dto.LoginRequest;
import com.gurukul.Hotel.dto.Response;
import com.gurukul.Hotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}