/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package fr.devavance.metier.beans;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kn_10
 */
public class UserTest {
    
    public UserTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    
    /**
     * Test of equals method, of class User.
     */
    @org.junit.jupiter.api.Test
    public void testEquals() {
        System.out.println("equals");
        String userName = "";
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.equals(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserName method, of class User.
     */
    @org.junit.jupiter.api.Test
    public void testGetUserName() {
        System.out.println("getUserName");
        User instance = new User();
        String expResult = "";
        String result = instance.getUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @org.junit.jupiter.api.Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getProfil method, of class User.
     */
    @org.junit.jupiter.api.Test
    public void testGetProfil() {
        System.out.println("getProfil");
        User instance = new User();
        String expResult = "";
        String result = instance.getProfil();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of getAuth method, of class User.
     */
    @org.junit.jupiter.api.Test
    public void testGetAuth() {
        System.out.println("getAuth");
        User instance = new User();
        Boolean expResult = null;
        Boolean result = instance.getAuth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setUserName method, of class User.
     */
    @org.junit.jupiter.api.Test
    public void testSetUserName() {
        System.out.println("setUserName");
        String userName = "";
        User instance = new User();
        instance.setUserName(userName);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @org.junit.jupiter.api.Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User instance = new User();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setProfil method, of class User.
     */
    @org.junit.jupiter.api.Test
    public void testSetProfil() {
        System.out.println("setProfil");
        String profil = "";
        User instance = new User();
        instance.setProfil(profil);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setAuth method, of class User.
     */
    @org.junit.jupiter.api.Test
    public void testSetAuth() {
        System.out.println("setAuth");
        Boolean auth = null;
        User instance = new User();
        instance.setAuth(auth);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class User.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        User instance = new User();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
}
