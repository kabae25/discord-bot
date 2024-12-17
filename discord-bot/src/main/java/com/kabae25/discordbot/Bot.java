package com.kabae25.discordbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {
    public static void main(String[] argv) throws Exception {
        String BOT_TOKEN = System.getenv("TOKEN");
        JDA api = JDABuilder.createDefault(BOT_TOKEN)
                .addEventListeners(new MyListener())
                .build();
    }
}
