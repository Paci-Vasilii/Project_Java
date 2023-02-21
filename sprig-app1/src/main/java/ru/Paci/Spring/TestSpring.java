package ru.Paci.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

     //   Music music = context.getBean("musicBean", Music.class);   // В контекстном меню я добавил новый бин следовательно можно эту строку удалить
     //   MusicPlayer musicPlayer = new MusicPlayer(music);  // тоже можно убрать, потому что нам не нужно уже создавать musicPlayer вручную

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();

    }
}
