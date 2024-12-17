package com.kabae25.discordbot;

import net.dv8tion.jda.api.entities.MessageEmbed;

/**
 * List needs to have:
 * String memberName
 *  - For going through list and stuff
 * unsigned int score
 *  - Score number that increases till 367
 * bool inactive
 *  - histerisis variable for comparing if the user should have their role changed
 */

public class Scorekeeper {

    /**
     * Sets the author's score to 0 in the members list
     * @param authorName
     */
    public void setScore(String authorName) {

    }

    /**
     * Checks the member list for inactive people
     * @return String authorName: username of person with inactive name
     */
    public String checkActivity() {
        return null;
    }
}
