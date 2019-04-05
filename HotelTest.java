import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.Assert.*;

public class HotelTest {
    private FilterEngine filterEngine;
    private FilterEngine altfilterEngine;
    private HotelDAO hotelDAO;
    @Before
    public void setUp() throws Exception {
        hotelDAO = new HotelDAO();
    }

    @After
    public void tearDown() throws Exception {
        hotelDAO = null;
    }

    @Test
    public void testHotelFilter() throws SQLException {
        assertEquals(hotelDAO.getFilteredHotels().get(0).getName(),"Vibrant Iceland Hostel");
    }

    @Test
    public void testRoomFilter() throws SQLException{
        assertEquals(hotelDAO.getFilteredRooms().get(0).getPrice(),215);
    }

}