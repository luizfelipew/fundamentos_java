//package backup_cashout;
//
//import com.oracle.webservices.internal.api.message.ContentType;
//
//import java.awt.print.Pageable;
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//public class Endpoints {
//
//
//    public static ValidatableResponse withdrawalGetConsumerByFilter(String consumerId, BigDecimal withdrawalValue,
//        WithdrawalAuthorizationStatus status, LocalDate referenceDate,  Pageable pagination){
//        return given()
//            .contentType(ContentType.JSON)
//            .accept(ContentType.JSON)
//            .queryParam("consumerId", consumerId)
//            .queryParam("withdrawalValue", withdrawalValue)
//            .queryParam("status", status)
//            .queryParam("referenceDate", referenceDate)
//            .queryParam("pagination", pagination)
//            .when()
//            //            .get("/v1/dashboard/consumer" + "?page=0&size=2")
//            .get("/v1/dashboard/consumer/")
//            .then();
//    }
//
//}
