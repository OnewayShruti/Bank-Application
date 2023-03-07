
package Bank_App;

public interface BaseRateInterface {
    default double InterestRate() {
        return 2.5;
    }
}
