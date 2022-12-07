package com.example.proyectofinal.persistence;

import com.example.proyectofinal.model.User;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Persistence {

    public static final String RUTA_ARCHIVO_USERS = "src/main/java/com/example/proyectofinal/persistence/resources/users.txt";

    public static void saveUsers(List<User> usersList) throws IOException {

        String content = "";

        for(User user: usersList) {
            content += user.getUsername()+"_"+user.getPassword()+"_"+user.getAge()+"_"+user.getId()+"_"+user.getService()+"\n";
        }

        ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_USERS, content, false);
    }

    public static List<User> loadUsers() throws FileNotFoundException, IOException {

        List<User> userList = new ArrayList<>();

        ArrayList<String> contenido = ArchivoUtil.leerArchivo(RUTA_ARCHIVO_USERS);

        String linea = "";

        for (String s : contenido) {
            User user = new User();
            linea = s;
            user.setUsername(linea.split("_")[0]);
            user.setPassword(linea.split("_")[1]);
            user.setAge(Integer.parseInt(linea.split("_")[2]));
            user.setId(linea.split("_")[3]);
            user.setService(linea.split("_")[4]);

            userList.add(user);
        }
        return userList;
    }
}
