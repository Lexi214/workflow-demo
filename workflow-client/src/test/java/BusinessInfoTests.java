import com.gabay.workflow.client.service.StaffInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BusinessInfoTests {

    @Autowired
    StaffInfoService staffInfoService;

    @Test
    public void getStaffInfo() {
        System.out.println(staffInfoService.getStaffInfoByStaffNo("N0001"));
        System.out.println(staffInfoService.getStaffInfoByStaffNo("N0006"));
    }

}
