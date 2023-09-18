package nosov.liachieve.corebackend.dto.user;

import nosov.liachieve.corebackend.entity.User;

public class DtoConverter {
    public static UserDTO convertToDTO(User entity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setLevel(entity.getLevel());
        userDTO.setName(entity.getName());
        userDTO.setPicture(entity.getPicture());
        userDTO.setStart_date(entity.getStart_date());
        userDTO.setTotal_score(entity.getTotal_score());
        userDTO.setToday_score(entity.getToday_score());
        return userDTO;
    }

    public static User convertFromDTO(CreateUserDTO createUserDTO) {
        User user = new User();
        user.setName(createUserDTO.getName());
        user.setLevel(createUserDTO.getLevel());
        user.setPicture(createUserDTO.getPicture());
        return user;
    }
}
