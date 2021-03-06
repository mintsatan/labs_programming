package com.company;

public class Main {

    public static void main(String[] args) {
        Sound music = new Music("Music");
        System.out.print(music.sounds());
        DancingCouples couple = new DancingCouples("Dancing couples", new DancingPeople("men", 22, "Earthling"), new DancingPeople("women", 22, "Earthling"));
        System.out.print(couple.appear());
        Watchers watcher = new Watchers("Watchers",  101, "Earthling");
        System.out.println(watcher.watchBroadcast(Themes.DANCING));
        watcher.setName("Nobody");
        System.out.print(watcher.didSomething("turn off", true, "the TV"));
        watcher.setName("Everyone");
        System.out.print(watcher.watchBroadcast(Themes.COSMONAUTS));
        watcher.setName("Sleepwalkers");
        System.out.println(watcher.didSomething("deceive in", true, "their expectations"));
        Radio radio = new Radio("radio", 600, 900);
        System.out.println(radio.translate(Themes.COSMONAUTS, Themes.GIANT_PLANTS, Themes.ZERO_GRAVITY));
        Television television = new Television("television", 600, 900);
        System.out.print(television.translate(Themes.COSMONAUTS, Themes.GIANT_PLANTS, Themes.ZERO_GRAVITY));
        watcher.setName("Everyone");
        System.out.println(watcher.didSomething("struck by", false, "the story of Hnugl"));
        PolicemanInZeroGravity Hnugl = new PolicemanInZeroGravity("Hnugl", 1, "Earthling");
        System.out.print(Hnugl.GetIntoZG());
        System.out.println(Hnugl.shoot("a long-range large-caliber rifle"));
        System.out.print(Hnugl.reactivePowerPlus());
        System.out.print(Hnugl.flyAround());
        System.out.print(Hnugl.checkCoordinates());
    }
}
