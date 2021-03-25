/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alexander
 */
public class InsurancePolicyEstimatorTest {
    
    public InsurancePolicyEstimatorTest() {
    }

    @Test
    public void testValidateAge() throws Exception {
        System.out.println("validateAge");
        int age = 0;
        InsurancePolicyEstimator instance = new InsurancePolicyEstimator();
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            instance.validateAge(age);
        });
    }

    @Test
    public void testCalculateInsurancePolicy() {
        
        System.out.println("calculateInsurancePolicy");
        int age = 33;
        InsurancePolicyEstimator instance = new InsurancePolicyEstimator();
        int expResult = 465;
        int result = instance.calculateInsurancePolicy(age);
        assertEquals(expResult, result);
    }
    
}
