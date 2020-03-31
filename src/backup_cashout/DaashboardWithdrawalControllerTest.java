//package com.picpay.cashout24horas.api.controller;
//
//import com.picpay.cashout24horas.api.BaseTests;
//import com.picpay.cashout24horas.api.Endpoints;
//import com.picpay.cashout24horas.api.payload.WithdrawalAuthorizationConsumerResponse;
//import com.picpay.cashout24horas.model.ResponseCode;
//import com.picpay.cashout24horas.model.WithdrawalAuthorizationStatus;
//import io.restassured.RestAssured;
//import lombok.val;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//import static com.picpay.cashout24horas.model.WithdrawalAuthorizationStatus.CREATED;
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//public class DashboardWithdrawalControllerTest extends BaseTests {
//
//    private static final String TRANSACTION_UUID = "b20f274c-a34b-11e9-a2a3-2a2ae2dbcce4";
//    private static final String CONDUMER_ID = "1";
//    private static final BigDecimal WITHDRAWALVALUE = BigDecimal.valueOf(20.0);
//    private static final WithdrawalAuthorizationStatus STATUS = CREATED;
//    private static final LocalDate REFERENCEDATE = LocalDate.now();
//    private static final PageRequest PAGINATION = new PageRequest(0, 10, Sort.unsorted());
//
//    @LocalServerPort
//    private int port;
//
//    @Before
//    public void setUp() {
//        RestAssured.port = port;
//        createWithdrawalAuthorizationDocument(TRANSACTION_UUID, CREATED, ResponseCode.APPROVED, 20.0);
//        createWithdrawalConfig("CONFIG", LocalDateTime.now(), BigDecimal.valueOf(20));
//    }
//
//    @Test
//    public void should_get_current_consumer_when_authorization_exists_by_id() {
//        val expectedRequestDocument = withdrawalAuthorizationRepository.findByConsumerId(CONDUMER_ID).get(0);
//
//        val expectedPayload = WithdrawalAuthorizationConsumerResponse.builder()
//            .id(expectedRequestDocument.getId())
//            .transactionUuid(expectedRequestDocument.getTransactionUuid())
//            .consumerId(expectedRequestDocument.getConsumer().getId())
//            .name(expectedRequestDocument.getConsumer().getName())
//            .cpf(expectedRequestDocument.getConsumer().getCpf())
//            .status(expectedRequestDocument.getStatus())
//            .withdrawalValue(expectedRequestDocument.getWithdrawalValue())
//            .terminalId(expectedRequestDocument.getTerminalId())
//            .createdAt(expectedRequestDocument.getCreatedAt())
//            .referenceDate(expectedRequestDocument.getReferenceDate())
//            .build();
//
//        val responsePayload = Endpoints
//            .withdrawalGetConsumerByFilter(CONDUMER_ID, WITHDRAWALVALUE, STATUS, REFERENCEDATE, PAGINATION)
//            .assertThat()
//            .statusCode(200)
//            .extract()
//            .as(WithdrawalAuthorizationConsumerResponse.class);
//
//        assertThat(responsePayload).isEqualToComparingFieldByField(expectedPayload);
//
//    }
//
//}
