package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class TicketTest {
    @Test

    public void shouldSortTicketsSeveral() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("GOJ", "SVO", 3500, 10, 11);
        Ticket ticket2 = new Ticket("GOJ", "DME", 3700, 8, 9);
        Ticket ticket3 = new Ticket("GOJ", "KGD", 8600, 14, 17);
        Ticket ticket4 = new Ticket("GOJ", "SVO", 2700, 7, 8);
        Ticket ticket5 = new Ticket("GOJ", "LED", 6500, 17, 20);
        Ticket ticket6 = new Ticket("GOJ", "SVO", 5500, 14, 15);
        Ticket ticket7 = new Ticket("GOJ", "SVO", 4400, 15, 16);
        Ticket ticket8 = new Ticket("GOJ", "SVO", 2200, 22, 23);
        Ticket ticket9 = new Ticket("GOJ", "DME", 3500, 10, 11);
        Ticket ticket10 = new Ticket("GOJ", "SVO", 2900, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] actual = manager.search("GOJ", "SVO");
        Ticket[] expected = {ticket8, ticket4, ticket10, ticket1, ticket7, ticket6};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test

    public void shouldSortTicketsNull() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("GOJ", "SVO", 3500, 10, 11);
        Ticket ticket2 = new Ticket("GOJ", "DME", 3700, 8, 9);
        Ticket ticket3 = new Ticket("GOJ", "KGD", 8600, 14, 17);
        Ticket ticket4 = new Ticket("GOJ", "SVO", 2700, 7, 8);
        Ticket ticket5 = new Ticket("GOJ", "LED", 6500, 17, 20);
        Ticket ticket6 = new Ticket("GOJ", "SVO", 5500, 14, 15);
        Ticket ticket7 = new Ticket("GOJ", "SVO", 4400, 15, 16);
        Ticket ticket8 = new Ticket("GOJ", "SVO", 2200, 22, 23);
        Ticket ticket9 = new Ticket("GOJ", "DME", 3500, 10, 11);
        Ticket ticket10 = new Ticket("GOJ", "SVO", 2900, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] actual = manager.search("GOJ", "NOV");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldSortTicketsOne() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("GOJ", "SVO", 3500, 10, 11);
        Ticket ticket2 = new Ticket("GOJ", "DME", 3700, 8, 9);
        Ticket ticket3 = new Ticket("GOJ", "KGD", 8600, 14, 17);
        Ticket ticket4 = new Ticket("GOJ", "SVO", 2700, 7, 8);
        Ticket ticket5 = new Ticket("GOJ", "LED", 6500, 17, 20);
        Ticket ticket6 = new Ticket("GOJ", "SVO", 5500, 14, 15);
        Ticket ticket7 = new Ticket("GOJ", "SVO", 4400, 15, 16);
        Ticket ticket8 = new Ticket("GOJ", "SVO", 2200, 22, 23);
        Ticket ticket9 = new Ticket("GOJ", "DME", 3500, 10, 11);
        Ticket ticket10 = new Ticket("GOJ", "SVO", 2900, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);

        Ticket[] actual = manager.search("GOJ", "KGD");
        Ticket[] expected = {ticket3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldSortTicketsSeveralComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("GOJ", "SVO", 3500, 9, 12); // 3
        Ticket ticket2 = new Ticket("GOJ", "DME", 3700, 8, 9);
        Ticket ticket3 = new Ticket("GOJ", "KGD", 8600, 14, 17);
        Ticket ticket4 = new Ticket("GOJ", "SVO", 2700, 7, 8); // 1
        Ticket ticket5 = new Ticket("GOJ", "LED", 6500, 17, 20);
        Ticket ticket6 = new Ticket("GOJ", "SVO", 5500, 14, 19); // 5
        Ticket ticket7 = new Ticket("GOJ", "SVO", 4400, 15, 16);//1
        Ticket ticket8 = new Ticket("GOJ", "SVO", 2200, 18, 22); // 4
        Ticket ticket9 = new Ticket("GOJ", "DME", 3500, 10, 11);
        Ticket ticket10 = new Ticket("GOJ", "SVO", 2900, 7, 9); //2
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        Comparator<Ticket> comparator= new TicketTimeComparator();

        Ticket[] actual = manager.search("GOJ", "SVO", comparator);
        Ticket[] expected = {ticket4, ticket7, ticket10, ticket1, ticket8, ticket6};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test

    public void shouldSortTicketsNullCompare() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("GOJ", "SVO", 3500, 9, 12); // 3
        Ticket ticket2 = new Ticket("GOJ", "DME", 3700, 8, 9);
        Ticket ticket3 = new Ticket("GOJ", "KGD", 8600, 14, 17);
        Ticket ticket4 = new Ticket("GOJ", "SVO", 2700, 7, 8); // 1
        Ticket ticket5 = new Ticket("GOJ", "LED", 6500, 17, 20);
        Ticket ticket6 = new Ticket("GOJ", "SVO", 5500, 14, 19); // 5
        Ticket ticket7 = new Ticket("GOJ", "SVO", 4400, 15, 16);//1
        Ticket ticket8 = new Ticket("GOJ", "SVO", 2200, 18, 22); // 4
        Ticket ticket9 = new Ticket("GOJ", "DME", 3500, 10, 11);
        Ticket ticket10 = new Ticket("GOJ", "SVO", 2900, 7, 9); //2
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        Comparator<Ticket> comparator= new TicketTimeComparator();

        Ticket[] actual = manager.search("GOJ", "NOV", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldSortTicketsOneCompare() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("GOJ", "SVO", 3500, 10, 11);
        Ticket ticket2 = new Ticket("GOJ", "DME", 3700, 8, 9);
        Ticket ticket3 = new Ticket("GOJ", "KGD", 8600, 14, 17);
        Ticket ticket4 = new Ticket("GOJ", "SVO", 2700, 7, 8);
        Ticket ticket5 = new Ticket("GOJ", "LED", 6500, 17, 20);
        Ticket ticket6 = new Ticket("GOJ", "SVO", 5500, 14, 15);
        Ticket ticket7 = new Ticket("GOJ", "SVO", 4400, 15, 16);
        Ticket ticket8 = new Ticket("GOJ", "SVO", 2200, 22, 23);
        Ticket ticket9 = new Ticket("GOJ", "DME", 3500, 10, 11);
        Ticket ticket10 = new Ticket("GOJ", "SVO", 2900, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        Comparator<Ticket> comparator= new TicketTimeComparator();

        Ticket[] actual = manager.search("GOJ", "KGD", comparator);
        Ticket[] expected = {ticket3};

        Assertions.assertArrayEquals(expected, actual);

    }
}