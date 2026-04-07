package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }
    



   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_same_object_returns_true(){
        assertEquals(true ,team.equals(team));
    }

    @Test
    public void not_team_object_returns_false(){
        assertEquals(false, team.equals(5));
    }

    @Test
    public void name_and_members_match_returns_true(){
        Team other = new Team("test-team");
        assertEquals(true, team.equals(other));

    }

    @Test
    public void name_dont_match_returns_false(){
        Team other = new Team("doesn't match");
        assertEquals(false, team.equals(other));

    }
    
    @Test
    public void members_dont_match_returns_false(){
        Team other = new Team("test-team");
        other.addMember("amember");
        assertEquals(false, team.equals(other));

    }

    @Test
    public void hash_codes_for_obj_with_same_name_and_members_equal(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());

    }

    // Not nesassary
    @Test
    public void hashcode_returns_specific_value(){
        // instantiate t as a Team object
        Team t = new Team();
        t.setName("foo");
        t.addMember("bar");
        int result = t.hashCode();
        int expectedResult = 130294;
        assertEquals(expectedResult, result);

    }




}
