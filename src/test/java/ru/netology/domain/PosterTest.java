package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.PosterManager;


public class PosterTest {
    Poster first = new Poster(1, "Bloodshot");
    Poster second = new Poster(2, "Forward");
    Poster third = new Poster(3, "Hotel Belgrade");
    Poster fourth = new Poster(4, "Gentlemans");
    Poster fifth = new Poster(5, "The invisible man");
    Poster sixth = new Poster(6, "Trolls");
    Poster seventh = new Poster(7, "Number one");
    Poster eigthth = new Poster(8, "Gladiator");
    Poster ninth = new Poster(9, "Scarface");
    Poster tenth = new Poster(10, "The Godfather");

    @Test
    public void test(){
        PosterManager manager = new PosterManager();

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Poster[] actual = manager.findAll();
        Poster[] expected = {first, second, third, fourth, fifth, sixth, seventh};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1(){
        PosterManager manager = new PosterManager();

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eigthth);
        manager.add(ninth);
        manager.add(tenth);

        Poster[] actual = manager.findLast();
        Poster[] expected = {tenth, ninth, eigthth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2(){
        PosterManager manager = new PosterManager(5);

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eigthth);
        manager.add(ninth);
        manager.add(tenth);

        Poster[] actual = manager.findLast();
        Poster[] expected = {tenth, ninth, eigthth, seventh, sixth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3(){
        PosterManager manager = new PosterManager(50);

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eigthth);
        manager.add(ninth);
        manager.add(tenth);

        Poster[] actual = manager.findLast();
        Poster[] expected = {tenth, ninth, eigthth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }
}