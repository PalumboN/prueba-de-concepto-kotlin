package conversor_kotlin

/**
 * Created by Palumbo on 08/04/2015.
 */
public class MiToKmConverter(val value: Double) {
    public var result : Double? = null

    public fun convert(){
        this.result = value * 1.609344
    }
}