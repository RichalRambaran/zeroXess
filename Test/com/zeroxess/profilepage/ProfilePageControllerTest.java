package com.zeroxess.profilepage;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProfilePageControllerTest {
    private ProfilePageController profile = new ProfilePageController();
}
    //Deze test was voor Project 1. Voor project 2 komt deze te vervallen omdat er nu gebruik wordt gemaakt van een UserProfile.

    /*
    In deze writingGameAnswers schrijf ik in het .txt bestand een voornaam en een achternaam. Vervolgens gebruik
    ik een methode die alle gegevens laadt en dat vergelijk ik om te kijken of het getInformatie Methode,
    gegevens succesvol kan laden.

    @Test
    public void showTxtFile() throws IOException {
        List<String> TestTxtFile = Files.readAllLines(Paths.get("ProfileInfo.txt"));
        TestTxtFile.set(0,"Bobby");
        TestTxtFile.set(1,"Brown");
        assertEquals(profile.getInformatieTxt(),TestTxtFile);
    }
*/