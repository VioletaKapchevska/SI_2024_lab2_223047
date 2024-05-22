package mk.ukim.finki;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    public void EveryBranchMethod(){
        //first test case
        RuntimeException ex;
        List<Item> items = null;
        ex = assertThrows(RuntimeException.class,()->SILab2.checkCart(items,5));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));
        //second test case
        List<Item> items1= Arrays.asList(new Item("Vazna", "V7", 350, 10.0f));
        ex = assertThrows(RuntimeException.class,()->SILab2.checkCart(items1,200));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));
        //third test case
        List<Item> items5 = Arrays.asList(new Item("Slika","5608",500,20.0f));
        assertFalse(SILab2.checkCart(items5,300));
        //fourth test case
        List<Item> items3 = Arrays.asList(new Item("Moliv","073",50,0.0f));
        assertTrue(SILab2.checkCart(items3,55));
        //fifth test case
        List<Item> items4 = Arrays.asList(new Item("","047",500,20.0f));
        assertFalse(SILab2.checkCart(items4,150));
        //sixth test case
        List<Item> items2= Arrays.asList(new Item("Ramka", null, 100, 4.0f));
        ex = assertThrows(RuntimeException.class,()->SILab2.checkCart(items2,50));
        assertTrue(ex.getMessage().contains("No barcode!"));
    }
    @Test
    public void MultipleConditionMethod(){
        //if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')

        List<Item> items = Arrays.asList(new Item("Anything", "123456", 300, 0.1f));
        assertTrue(SILab2.checkCart(items,30));// F && X && X

        List<Item> items01 = Arrays.asList(new Item("ItemAnything1", "1234567", 350, 0.0f));
        assertTrue(SILab2.checkCart(items01,350));//T && F && X

        List<Item> items02= Arrays.asList(new Item("ItemAnything2", "012345", 350, 0.1f));
        assertTrue(SILab2.checkCart(items02,305));//T && T && T

    }
}