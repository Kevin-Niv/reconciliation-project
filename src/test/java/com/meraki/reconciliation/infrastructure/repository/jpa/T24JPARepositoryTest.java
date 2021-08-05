package com.meraki.reconciliation.infrastructure.repository.jpa;

import com.meraki.reconciliation.infrastructure.repository.jpa.model.T24Recon;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.BDDAssumptions.given;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class T24JPARepositoryTest {

    @Autowired
    private T24JPARepository t24JPARepository;

    @BeforeAll
    public static void before(){
    }
    /*
    @Test
    public void saveT24Recon() {
    }*/
    @Test //-Passed
    @Order(1)
    public void saveT24ReconTest(){
        T24Recon t24Recon = T24Recon.builder()
                .tableId("177821113847625.030004").currency("KES").amountLcy("3").amountFcy("43").bookingDate("20160906").valueDate("20160906").dealNumber("KES1792800010001")
                .custId("").accountName("Excise Duty Collected KES ").txnRef("FT16250BLFQ5").chequeNo("").paymentDetails("MPESA 254725504349 021544596162").eslipDate("").eslipTaxCode("").eslipTaxComp("")
                .offUniqRef("21544596162").paidInBy("").recordStatus("MAT").txnCode("465").productCode("17928").productName("Excise Duty Collected").assetType("CREDIT")
                .consolKey("AC.1.TR.KES.17928.........3052...KE0010001").systemId("FT").build();
        t24JPARepository.save(t24Recon);
        Assertions.assertThat(t24Recon.getTableId()).isGreaterThan("0");
        System.out.println("Created Record: "+ t24Recon);
    }
/*
    @Test// - Passed
    public void createT24Recon(){
        T24Recon t24Recon = new T24Recon("177823899447618.000004","KES","3.0000000","3","20160906","20160906","KES1792800010001","",
                "Excise Duty Collected KES","FT16250BLFQ5","","MPESA 254725504349 021544596162","","","","21544596162","","MAT","465","17928","Excise Duty Collected",
                "CREDIT","AC.1.TR.KES.17928.........3052...KE0010001","FT");
                T24Recon createT24Recon =  t24JPARepository.save(t24Recon);
                assertNotNull(createT24Recon);//passed param not null.
        //177823781047619.050001
        //177826684647417.000001
        //177824863763205.080002
        //177828245047423.030005
        //177826358124774.050002
        //177826358124904.050002
    }*/
  @Test
  @Order(2)
    public void getT24Recon(){
    T24Recon t24Recon = t24JPARepository.findById("177826358124774.050002").get();

    Assertions.assertThat(t24Recon.getTableId()).isEqualTo("177826358124774.050002");

}
@Test
@Order(3)
    public  void getListT24Recon(){
        List<T24Recon> t24Recons = t24JPARepository.findAll();

        Assertions.assertThat(t24Recons.size()).isGreaterThan(0);
    }
    @Test
    @Order(4)
    public void updateT24ReconTest(){
        T24Recon t24Recon = t24JPARepository.findById("177825617347618.020003").get();
        t24Recon.setAmountLcy("101000");
        t24Recon.setCurrency("USD");
        t24Recon.setAmountFcy("20100");
        T24Recon t24Recon1 = t24JPARepository.save(t24Recon);
        Assertions.assertThat(t24Recon1.getAmountLcy()).isEqualTo("101000");
        Assertions.assertThat(t24Recon1.getCurrency()).isEqualTo("USD");
        Assertions.assertThat(t24Recon1.getAmountFcy()).isEqualTo("20100");
        System.out.println("Updated T24Recon: "+ t24Recon1);
    }

    @Test
    @Order(5)
    public void deleteT24ReconTest(){
        T24Recon t24Recon = t24JPARepository.findById("177821113847625.030004").get();

        t24JPARepository.delete(t24Recon);
        System.out.println("Deleted Record: " + t24Recon);
        //t24JPARepository.deleteById("177825617347618.020003");
    }
/*
    }
    @Test
    public void getT24ReconTest(){
        T24Recon t24Recon = t24JPARepository.findById("177823781047619.050001").get();
        Assertions.assertThat(t24JPARepository.getT24ReconByTableId()).isEqualTo(177823781047619.050001);
    }
        @Test
        public void deleteByTableId (String tableId){
            t24JPARepository.deleteByTableId(tableId);
        }
    @Test
    public T24Recon updateT24Recon(T24Recon t24Recon){
        t24Recon.setTableId("177823781047619.050001");
        t24Recon.setAmountLcy("10000");
        return t24Recon;
    }
    @Test
    public void updateT24ReconTest(){//last done
        T24Recon t24Recon = t24JPARepository.findById("177823781047619.050001").get();
        t24Recon.setAmountLcy("10000");
        T24Recon t24Recon1 = t24JPARepository.save(t24Recon);
        Assertions.assertThat(t24Recon1.getAmountLcy()).isEqualTo("10000");
    }
    @Test
    public void testFindT24ReconByTableId(){
        String tableId = "177823781047619.050001";
        Optional<T24Recon> t24Recon = t24JPARepository.findById(tableId);


    }
    @Test
    public Optional<T24Recon> getById(String tableId){
       return t24JPARepository.findById("177823781047619.050001");
        // T24Recon t24Recon = t24JPARepository.findById("tableId").get();
        //assertEquals("177823781047619.050001",t24Recon.getTableId());
    }
    @Test//done last
    public void getListOfT24Recon(){
        List<T24Recon> t24Recons = t24JPARepository.findAll();
        Assertions.assertThat(t24Recons.size()).isGreaterThan(0);
    }
    //done last
    @Test
    public void deleteT24Recon(){
        T24Recon t24Recon = t24JPARepository.findById("177824863763205.080002").get();
        t24JPARepository.delete(t24Recon);
    }
*/
}
