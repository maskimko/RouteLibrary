/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.pp.msk.project1.lib.routelibrary;

import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


/**
 *
 * @author maskimko
 */
public class ArpTableInformationImplTest {
    
    public ArpTableInformationImplTest() {
    }

    /**
     * Test of getArpTable method, of class ArpTableInformationImpl.
     */
    @Test
    public void testGetArpTable() {
        System.out.println("getArpTable");
        ArpTableInformationImpl instance = new ArpTableInformationImpl();
        List<ArpTableRecord> result = instance.getArpTable();
        assertTrue(result.size() > 0);
        
    }
    
}
