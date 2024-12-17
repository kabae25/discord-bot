package com.kabae25.discordbot;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MyListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return; // ignore if the message is a bot message

        Message message = event.getMessage();
        String content = message.getContentRaw();

        if (content.equals("!ping")){
            MessageChannel channel = event.getChannel(); // get the channel the message happened in
            channel.sendMessage("Pong!").queue(); // important to call .queue() on the RestAction returned by sendMessage()
        }
    }
}
