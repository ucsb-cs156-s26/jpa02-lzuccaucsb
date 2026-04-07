package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Lorenzo", Developer.getName());
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("lzuccaucsb", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name(){
        Team t = Developer.getTeam();
        assertEquals("s26-xx", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_Lorenzo() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Lorenzo"), "Team should contain Lorenzo");

    }

    @Test
    public void getTeam_returns_team_with_Arjun_M(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Arjun M"), "Team should contain Arjun M");
    }

    @Test
    public void getTeam_returns_team_with_Jay(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Jay"), "Team should contain Jay");
    }

    @Test
    public void getTeam_returns_team_with_Arjun_S(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Arjun S"), "Team should contain Arjun S");
    }

    @Test
    public void getTeam_returns_team_with_Pau(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Pau"), "Team should contain Pau");
    }

    @Test
    public void getTeam_returns_team_with_Pengyu(){
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Pengyu"), "Team should contain Pengyu");
    }
}
