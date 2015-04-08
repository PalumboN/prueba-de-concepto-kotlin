package conversor_kotlin

import org.junit.Test
import kotlin.test.assertEquals
import org.junit.Test as test

/**
 * Created by Palumbo on 08/04/2015.
 */
public class MiToKmConverterTest
{
    Test fun convertCorrectly()
    {
        val converter = MiToKmConverter(1.0)
        converter.convert()
        assertEquals(1.609344, converter.result)
    }
}