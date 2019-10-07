package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        //Path path1 = Paths.get("/home/user2/statusReport");
        //Path path2 = Paths.get("/home","user2","statusReport");
        Path path1 = Paths.get("C:\\temp\\TesteJava\\src\\Main.java");
// Caminho a partir da raiz do usuário (depende do S.O.)
        //Path path4 = Paths.get(System.getProperty("user.home"),"books", "java7.pdf");

        System.out.println("toString: "     + path1.toString());     // /home/user2/statusReport
        System.out.println("getFileName: "  + path1.getFileName());  // statusReport
        System.out.println("getName(0): "   + path1.getName(0));     // home
        System.out.println("getNameCount: " + path1.getNameCount()); // 3
        System.out.println("subpath(0,2): " + path1.subpath(0,2));   // /home/user2
        System.out.println("getParent: "    + path1.getParent());    // /home/user2
        System.out.println("getRoot: "      + path1.getRoot());      // / ou C:\
    }
}
