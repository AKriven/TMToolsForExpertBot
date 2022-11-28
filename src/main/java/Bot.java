import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Bot extends TelegramLongPollingBot {




    //files for volsk
    File VOL_CEMI42N = new File("src/main/resources/VOL_PDS_CEM I 42.5N_2022 Q3_RUS.pdf");
    File VOL_CEMI42N_CC = new File("src/main/resources/ВОЛ_ ЦЕМ I 42,5Н_Сертификат_2021-2022.pdf");
    File VOL_CEMII42N = new File("src/main/resources/VOL_PDS_CEM II A-LL 42.5N_2022 Q3_RUS.pdf");
    File VOL_CEMII42N_CC = new File("src/main/resources/ВОЛ_ЦЕМ II А-И 42,5Н_Сертификат_2022-2023.pdf");
    File VOL_CEMII_AS_42N = new File("src/main/resources/VOL_PDS_CEM II A-S 42.5N_2022 Q3_RUS.pdf");
    File VOL_CEMII_AS_42N_CC = new File("src/main/resources/ВОЛ_ЦЕМ II А-Ш 42,5Н_Сертификат_2022-2023.pdf");
    File VOL_CEMII_AS_42DO = new File("src/main/resources/VOL_PDS_CEM II A-S 42.5N DO_2022 Q3_RUS.pdf");
    File VOL_CEMII_AS_42DO_CC = new File("src/main/resources/ВОЛ_ЦЕМ II А-Ш 42,5Н ДО_Сертификат_2021-2023.pdf");
    File VOL_CEM052N = new File("src/main/resources/VOL_PDS_CEM 0 52.5N_2022 Q3_RUS.pdf");
    File VOL_CEM052N_CC = new File("src/main/resources/ВОЛ_ЦЕМ 0 52,5Н_Сертификат_2022-2023.pdf");
    File VOL_CEMI52AP = new File("src/main/resources/VOL_PDS_CEM I 52.5N AP_2022 Q3_RUS.pdf");
    File VOL_CEMI52AP_CC = new File("src/main/resources/ВОЛ_ЦЕМ I 52,5Н АП_Сертификат_2022-2023.pdf");
    File VOL_CEMI52ZI = new File("src/main/resources/VOL_PDS_CEM I 52.5N ZI_2022 Q3_RUS.pdf");
    File VOL_CEMI52ZI_CC = new File("src/main/resources/ВОЛ_ЦЕМ I  52,5Н ЖИ_Сертификат_2022-2023.pdf");
    File VOL_CEMI52DP = new File("src/main/resources/VOL_PDS_CEM I 52.5N DP_2022 Q3_RUS.pdf");
    File VOL_CEMI52DP_CC = new File("src/main/resources/ВОЛ_ЦЕМ I 52,5Н ДП_Сертификат_2021-2023.pdf");
    //tech properties
    InputFile VOL_CEMI42N_descr = new InputFile(VOL_CEMI42N);
    InputFile VOL_CEMII42N_descr = new InputFile(VOL_CEMII42N);
    InputFile VOL_CEMII_AS_42N_descr = new InputFile(VOL_CEMII_AS_42N);
    InputFile VOL_CEMII_AS_42DO_descr = new InputFile(VOL_CEMII_AS_42DO);
    InputFile VOL_CEM052N_descr = new InputFile(VOL_CEM052N);
    InputFile VOL_CEMI52AP_descr = new InputFile(VOL_CEMI52AP);
    InputFile VOL_CEMI52ZI_descr = new InputFile(VOL_CEMI52ZI);
    InputFile VOL_CEMI52DP_descr = new InputFile(VOL_CEMI52DP);
    //certificate
    InputFile VOL_CEMI42N_cert = new InputFile(VOL_CEMI42N_CC);
    InputFile VOL_CEMII42N_cert = new InputFile(VOL_CEMII42N_CC);
    InputFile VOL_CEMII_AS_42N_cert = new InputFile(VOL_CEMII_AS_42N_CC);
    InputFile VOL_CEMII_AS_42DO_cert = new InputFile(VOL_CEMII_AS_42DO_CC);
    InputFile VOL_CEM052N_cert = new InputFile(VOL_CEM052N_CC);
    InputFile VOL_CEMI52AP_cert = new InputFile(VOL_CEMI52AP_CC);
    InputFile VOL_CEMI52ZI_cert = new InputFile(VOL_CEMI52ZI_CC);
    InputFile VOL_CEMI52DP_cert = new InputFile(VOL_CEMI52DP_CC);

    //files for shurovo
    File SHU_CEMI42N = new File("src/main/resources/SHU_PDS_CEM I 42.5N_2022 Q3_RUS.pdf");
    File SHU_CEMI42N_CC = new File("src/main/resources/ЩУР_ЦЕМ I 42,5Н_Сертификат_2021-2022.pdf");
    File SHU_CEMII42N = new File("src/main/resources/SHU_PDS_CEM II A-LL 42.5N_2022 Q3_RUS.pdf");
    File SHU_CEMII42N_CC = new File("src/main/resources/ЩУР_ЦЕМ II А-И 42,5Н_Сертификат_2021-2022.pdf");
    File SHU_CEM052N = new File("src/main/resources/SHU_PDS_CEM 0 52.5N_2022 Q3_RUS.pdf");
    File SHU_CEM052N_CC = new File("src/main/resources/ЩУР_ЦЕМ 0 52,5Н_Сертификат_2021-2022.pdf");
    File SHU_PCW = new File("src/main/resources/SHU_PDS_PCW 1-500-D0_2022 Q3_RUS.pdf");
    File SHU_PCW_CC = new File("src/main/resources/ЩУР_ПЦБ 1-500-Д0_Сертификат_2021-2022.pdf");
    File SHU_CEMI52AP = new File("src/main/resources/SHU_PDS_CEM I 52.5N AP_2022 Q3_RUS.pdf");
    File SHU_CEMI52AP_CC = new File("src/main/resources/ЩУР_ЦЕМ I 52,5Н АП_Сертификат_2021-2022.pdf");
    File SHU_CEMI52DP = new File("src/main/resources/SHU_PDS_CEM I 52.5N DP_2022 Q3_RUS.pdf");
    File SHU_CEMI52DP_CC = new File("src/main/resources/ЩУР_ЦЕМ I 52,5Н ДП_Сертификат_2021-2022.pdf");
    File SHU_CEMI52ZI = new File("src/main/resources/SHU_PDS_CEM I 52.5N ZI_2022 Q3_RUS.pdf");
    File SHU_CEMI52ZI_CC = new File("src/main/resources/ЩУР_ЦЕМ I  52,5Н ЖИ_Сертификат_2021-2022.pdf");
    //tech properties
    InputFile SHU_CEMI42N_descr = new InputFile(SHU_CEMI42N);
    InputFile SHU_CEMII42N_descr = new InputFile(SHU_CEMII42N);
    InputFile SHU_CEM052N_descr = new InputFile(SHU_CEM052N);
    InputFile SHU_PCW_descr = new InputFile(SHU_PCW);
    InputFile SHU_CEMI52AP_descr = new InputFile(SHU_CEMI52AP);
    InputFile SHU_CEMI52DP_descr = new InputFile(SHU_CEMI52DP);
    InputFile SHU_CEMI52ZI_descr = new InputFile(SHU_CEMI52ZI);
    //certificate
    InputFile SHU_CEMI42N_cert = new InputFile(SHU_CEMI42N_CC);
    InputFile SHU_CEMII42N_cert = new InputFile(SHU_CEMII42N_CC);
    InputFile SHU_CEM052N_cert = new InputFile(SHU_CEM052N_CC);
    InputFile SHU_PCW_cert = new InputFile(SHU_PCW_CC);
    InputFile SHU_CEMI52AP_cert = new InputFile(SHU_CEMI52AP_CC);
    InputFile SHU_CEMI52DP_cert = new InputFile(SHU_CEMI52DP_CC);
    InputFile SHU_CEMI52ZI_cert = new InputFile(SHU_CEMI52ZI_CC);

    //files for Fersikovo



    //files for fersikovo cem 1B
    File FER_PDS_CEMI = new File("src/main/resources/FER_PDS_CEM I 42.5R_2022 Q3_RUS.pdf");
    File FER_PDS_CEMI_certificate = new File("src/main/resources/ФЕР_ЦЕМ I 42,5Б_Сертификат_2022-2023.pdf");
    InputFile CEM1B_descr = new InputFile(FER_PDS_CEMI);
    InputFile CEM1B_certificate = new InputFile(FER_PDS_CEMI_certificate);

    //files for fersikovo cem2
    File FER_PDS_CEMII = new File("src/main/resources/FER_PDS_CEM II A-LL 42.5R_2022 Q2_RUS.pdf");
    File fer_PDS_CEMII_certificate = new File("src/main/resources/ФЕР_ЦЕМ II А-И 42,5Б_Сертификат_2022-2023.pdf");
    InputFile CEM2B_descr = new InputFile (FER_PDS_CEMII);
    InputFile CEM2B_certificate = new InputFile(fer_PDS_CEMII_certificate);



    public static void main(String[] args) throws TelegramApiException {

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

        // TODO Register our bot
    }


@Override
public void onUpdateReceived(Update update) {

    // We check if the update has a message and the message has text
    if (update.hasMessage() && update.getMessage().hasText()) {
        String message_text = update.getMessage().getText();
        if (update.getMessage().getText().equals("/start")) {
            try {
                execute(sendStartInlineKeyboardMessage(update.getMessage().getChatId()));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        }
           else   if (update.hasCallbackQuery()){
    Message message = update.getMessage();
        switch (update.getCallbackQuery().getData()) {
            case "toStart":
                try {
                    execute(sendStartInlineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;



            case "cement":
             try{
                 execute(sendPlantInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));

        } catch (TelegramApiException e) {
                 e.printStackTrace();
             }
             break;

            case "volsk":
                try {
                    execute(sendVolskInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "fer":
                try {
                    execute(sendFerInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;

            case "shu":
                try {
                    execute(sendShuInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;


                // volsk cement block
            case "VOL_CEM1_42N":
                try {
                    execute(sendVolskCem142InLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEM2_42N":
                try {
                    execute(sendVolskCemII42InLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case  "VOL_CEM2_AS_42N":
                try {
                    execute(sendVolskCemIIAS42InLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEM2_AS_42DO":
                try {
                    execute(sendVolskCemIIAS42DOInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case  "VOL_CEM52":
                try {
                    execute(sendVolskCEM52InLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                e.printStackTrace();
            }
                break;
            case "VOL_CEM0_52N":
                try {
                    execute(sendVolskCem052InLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case  "VOL_CEMI_52N_AP":
                try {
                    execute(sendVolskCemI52APInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "VOL_CEMI_52N_DP":
                try {
                    execute(sendVolskCemI52DPPInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEMI_52N_ZI":
                try {
                    execute(sendVolskCemI52ZIPInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            // volsk docs block
            case "VOL_CEM142N_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMI42N_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEM142N_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMI42N_cert, "done" );
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case  "VOL_CEMII42N_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMII42N_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEMII42N_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMII42N_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEMIIAS42N_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(),VOL_CEMII_AS_42N_descr, "done" );
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEMIIAS42N_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMII_AS_42N_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEMIIAS42NDO_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMII_AS_42DO_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEMIIAS42NDO_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMII_AS_42DO_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEM052N_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEM052N_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEM052N_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEM052N_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "VOL_CEMI52_AP_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMI52AP_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "VOL_CEMI52_AP_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMI52AP_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "VOL_CEMI52_DP_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMI52DP_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "VOL_CEMI52_DP_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMI52DP_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "VOL_CEMI52_ZI_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMI52ZI_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "VOL_CEMI52_ZI_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), VOL_CEMI52ZI_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;


                //shurovo cement block
            case "SHU_CEM1_42":
            try {
                execute(sendShuCem142InLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
            } catch (TelegramApiException e){
                e.printStackTrace();
            }
            break;

            case  "SHU_CEM2_42":
                try {
                    execute(sendShuCem242InLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEM_52N":
                try {
                    execute(sendShuCEM52InLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEM0_52N":
                try {
                    execute(sendShuCem052InLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEMI_52N_AP":
                try {
                    execute(sendShuCemI52APInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "SHU_CEMI_52N_DP":
                try {
                    execute(sendShuCemI52DPInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEMI_52N_ZI":
                try {
                    execute(sendShuCemI52ZIInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                 break;

            case "SHU_PCW":
                try {
                    execute(sendShuPCWInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;


            //shurovo docs block
            case "SHU_CEM142N_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_CEMI42N_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEM142N_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_CEMI42N_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEM242N_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_CEMII42N_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEM242N_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_CEMII42N_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "SHU_CEM052N_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_CEM052N_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEM052N_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_CEM052N_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEMI52_AP_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_CEMI52AP_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEMI52_AP_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_CEMI52AP_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEMI52_DP_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_CEMI52DP_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEMI52_DP_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_CEMI52DP_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_CEMI52_ZI_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(),SHU_CEMI52ZI_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "SHU_CEMI52_ZI_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(),SHU_CEMI52ZI_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "SHU_PCW_tech":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_PCW_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "SHU_PCW_cc":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), SHU_PCW_cert, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;






            case "cem1B":
                try{
                    execute(sendCem1BFerInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "cem1B_tech_properties":
                try {
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), CEM1B_descr, "done" );
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "cem1B_certificate":
                try{
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), CEM1B_certificate, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            case "cem2B":
                try {
                    execute((sendCem2BFerInLineKeyboardMessage(update.getCallbackQuery().getMessage().getChatId())));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;

            case "cem2B_tech_properties":
                try{
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), CEM2B_descr, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;
            case "cem2B_certificate":
                try{
                    sendDocUploadingAFile(update.getCallbackQuery().getMessage().getChatId(), CEM2B_certificate, "done");
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;

            default:
                try {
                    execute(notComplited(update.getCallbackQuery().getMessage().getChatId()));
                } catch (TelegramApiException e){
                    e.printStackTrace();
                }
                break;



        }

    }
}






    private void sendDocUploadingAFile(long chatId, InputFile save, String caption) throws TelegramApiException {

        SendDocument sendDocument = new SendDocument();
        sendDocument.setChatId(chatId);
        sendDocument.setDocument(save);
        sendDocument.setCaption(caption);
        try {
            execute(sendDocument);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    //keyboard start
    public static SendMessage sendStartInlineKeyboardMessage (long chatId) {
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Сухие смеси");
        inlineKeyboardButton.setCallbackData("dry_mix");
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Навальный цемент");
        inlineKeyboardButton1.setCallbackData("cement");
        rowInline.add(inlineKeyboardButton);
        rowInline.add(inlineKeyboardButton1);


        InlineKeyboardButton visitSite = new InlineKeyboardButton();
        visitSite.setText("Посетить наш сайт");
        visitSite.setUrl("https://cemlab.holcimrus.ru");
        List<InlineKeyboardButton> inlineKeyboardRow = new ArrayList<>();
        inlineKeyboardRow.add(visitSite);

        // Set the keyboard to the markup
        rowsInline.add(rowInline);
        rowsInline.add(inlineKeyboardRow);
        // Add it to the message
        markupInline.setKeyboard(rowsInline);
        SendMessage startMessage = new SendMessage();
        startMessage.setChatId(chatId);
        startMessage.setText("Выберите категорию продукта");
        startMessage.setReplyMarkup(markupInline);
        return startMessage;

    }

    // keyboard for plant

    public static SendMessage sendPlantInLineKeyboardMessage(long chatId) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();  //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();   //  кнопка номер раз
        inlineKeyboardButton.setText("Ферзиково");
        inlineKeyboardButton.setCallbackData("fer");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton(); //кнопка номер жва
        inlineKeyboardButton1.setText("Щурово");
        inlineKeyboardButton1.setCallbackData("shu");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>(); // объединяем их в ряд
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton volsk = new InlineKeyboardButton(); // кнопка номер три
        volsk.setText("Вольск");
        volsk.setCallbackData("volsk");

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка номер 4
        back.setText("Назад");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>(); // создаем еще один ряд и добавляем туда 3-ю  и 4-ю кнопку
        keyboardButtonsRow1.add(volsk);
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>(); // объединение рядов для нормального отображения, ну или добавление 3-го ряда кнопок
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList); // добавляем их в разметку клавиатуры
        SendMessage plantMessage = new SendMessage();
        plantMessage.setChatId(chatId);
        plantMessage.setText("Выберите  завод");
        plantMessage.setReplyMarkup(inlineKeyboardMarkup);
        return plantMessage;
    }
    // keyboard for fersikovo

    public static SendMessage sendFerInLineKeyboardMessage(long chatId) {
        InlineKeyboardMarkup markupInline1 = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("ЦЕМ I 42,5Б");
        inlineKeyboardButton.setCallbackData("cem1B");
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("ЦЕМ II/А-И 42,5Б");
        inlineKeyboardButton1.setCallbackData("cem2B");
        rowInline.add(inlineKeyboardButton);
        rowInline.add(inlineKeyboardButton1);

        // Set the keyboard to the markup
        rowsInline.add(rowInline);
        // Add it to the message
        markupInline1.setKeyboard(rowsInline);
        SendMessage ferMessage = new SendMessage();
        ferMessage.setChatId(chatId);
        ferMessage.setText("Выберите продукт");
        ferMessage.setReplyMarkup(markupInline1);
        return  ferMessage;

    }

    //keyboard for shurovo
    public static SendMessage sendShuInLineKeyboardMessage(long chatId) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();  //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();   //  кнопка номер раз
        inlineKeyboardButton.setText("ЦЕМ I 42,5Н");
        inlineKeyboardButton.setCallbackData("SHU_CEM1_42");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton(); //кнопка номер жва
        inlineKeyboardButton1.setText("ЦЕМ II/А-И 42,5Н");
        inlineKeyboardButton1.setCallbackData("SHU_CEM2_42");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>(); // объединяем их в ряд
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton cem52N = new InlineKeyboardButton(); // кнопка номер три
        cem52N.setText("ЦЦЕМ 0 52,5Н / ЦЕМ I 52,5Н(АП/ЖИ/ДП)");
        cem52N.setCallbackData("SHU_CEM_52N");

        List<InlineKeyboardButton> keyboardButtinsRow1 = new ArrayList<>(); // создаем еще один ряд и добавляем туда 3-ю кнопку
        keyboardButtinsRow1.add(cem52N);

        InlineKeyboardButton PCW = new InlineKeyboardButton();
        PCW.setText("Белый ПЦ 500-1-Д0-Н");
        PCW.setCallbackData("SHU_PCW");
        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>();
        keyboardButtonsRow2.add(PCW);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow3.add(back);



        List<List<InlineKeyboardButton>> rowList = new ArrayList<>(); // объединение рядов для нормального отображения, ну или добавление 3-го ряда кнопок
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtinsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);


        inlineKeyboardMarkup.setKeyboard(rowList); // добавляем их в разметку клавиатуры

        SendMessage plantMessage = new SendMessage();
        plantMessage.setChatId(chatId);
        plantMessage.setText("Выберите продукт");
        plantMessage.setReplyMarkup(inlineKeyboardMarkup);
        return plantMessage;

    }

    //keyboard for cem 1 42 shurovo
    public static SendMessage sendShuCem142InLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("SHU_CEM142N_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("SHU_CEM142N_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cem142ShuMessage = new SendMessage();
        cem142ShuMessage.setChatId(chatId);
        cem142ShuMessage.setText("Выберите документ");
        cem142ShuMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cem142ShuMessage;
    }

    //keyboard for cem 2 42 shurovo
    public static SendMessage sendShuCem242InLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("SHU_CEM242N_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("SHU_CEM242N_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cem242ShuMessage = new SendMessage();
        cem242ShuMessage.setChatId(chatId);
        cem242ShuMessage.setText("Выберите документ");
        cem242ShuMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cem242ShuMessage;
    }
    //keyboard for cem 52 shurovo
    public static SendMessage sendShuCEM52InLineKeyboardMessage(long chatId) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();  //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();   //  кнопка номер раз
        inlineKeyboardButton.setText("ЦЕМ 0 52,5Н");
        inlineKeyboardButton.setCallbackData("SHU_CEM0_52N");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton(); //кнопка номер два
        inlineKeyboardButton1.setText("ЦЕМ I 52,5Н AП");
        inlineKeyboardButton1.setCallbackData("SHU_CEMI_52N_AP");


        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>(); // объединяем их в ряд
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton(); //кнопка номер 3(2 ряд)
        inlineKeyboardButton2.setText("ЦЕМ I 52,5Н ДП");
        inlineKeyboardButton2.setCallbackData("SHU_CEMI_52N_DP");

        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton(); // кнопка номер 4( во втором ряду)
        inlineKeyboardButton3.setText("ЦЕМ I 52,5Н ЖИ");
        inlineKeyboardButton3.setCallbackData("SHU_CEMI_52N_ZI");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>(); //объединяем 3 и 4 кнопку в ряд(Ряд 2)
        keyboardButtonsRow1.add(inlineKeyboardButton2);
        keyboardButtonsRow1.add(inlineKeyboardButton3);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow3.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>(); // объединение рядов для нормального отображения, ну или добавление 3-го ряда кнопок
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow3);

        inlineKeyboardMarkup.setKeyboard(rowList); // добавляем их в разметку клавиатуры

        SendMessage shurovoCEM52 = new SendMessage();
        shurovoCEM52.setChatId(chatId);
        shurovoCEM52.setText("Выберите продукт");
        shurovoCEM52.setReplyMarkup(inlineKeyboardMarkup);
        return shurovoCEM52;

    }
    //keyboard for cem 0 52 shurovo
    public static SendMessage sendShuCem052InLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("SHU_CEM052N_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("SHU_CEM052N_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cem052NShuMessage = new SendMessage();
        cem052NShuMessage.setChatId(chatId);
        cem052NShuMessage.setText("Выберите документ");
        cem052NShuMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cem052NShuMessage;
    }
    //keyboard for cem 1 52 AP
    public static SendMessage sendShuCemI52APInLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("SHU_CEMI52_AP_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("SHU_CEMI52_AP_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cemI52NAPShuMessage = new SendMessage();
        cemI52NAPShuMessage.setChatId(chatId);
        cemI52NAPShuMessage.setText("Выберите документ");
        cemI52NAPShuMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cemI52NAPShuMessage;
    }
    //keyboard for cem 1 52 DP
    public static SendMessage sendShuCemI52DPInLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("SHU_CEMI52_DP_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("SHU_CEMI52_DP_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cemI52NDPShuMessage = new SendMessage();
        cemI52NDPShuMessage.setChatId(chatId);
        cemI52NDPShuMessage.setText("Выберите документ");
        cemI52NDPShuMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cemI52NDPShuMessage;
    }
    //keyboard for cem 1 52 ZI
    public static SendMessage sendShuCemI52ZIInLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("SHU_CEMI52_ZI_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("SHU_CEMI52_ZI_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cemI52NZIShuMessage = new SendMessage();
        cemI52NZIShuMessage.setChatId(chatId);
        cemI52NZIShuMessage.setText("Выберите документ");
        cemI52NZIShuMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cemI52NZIShuMessage;
    }
    //keyboard for PCW shurovo
    public static SendMessage sendShuPCWInLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("SHU_PCW_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("SHU_PCW_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage PCWShuMessage = new SendMessage();
        PCWShuMessage.setChatId(chatId);
        PCWShuMessage.setText("Выберите документ");
        PCWShuMessage.setReplyMarkup(inlineKeyboardMarkup);
        return PCWShuMessage;
    }



    //reyboard for volsk
    public static SendMessage sendVolskInLineKeyboardMessage(long chatId) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();  //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();   //  кнопка номер раз
        inlineKeyboardButton.setText("ЦЕМ I 42,5Н");
        inlineKeyboardButton.setCallbackData("VOL_CEM1_42N");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton(); //кнопка номер два
        inlineKeyboardButton1.setText("ЦЕМ II/А-И 42,5Н");
        inlineKeyboardButton1.setCallbackData("VOL_CEM2_42N");


        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>(); // объединяем их в ряд
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton(); //кнопка номер 3(2 ряд)
        inlineKeyboardButton2.setText("ЦЕМ II/А-Ш 42,5Н");
        inlineKeyboardButton2.setCallbackData("VOL_CEM2_AS_42N");

        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton(); // кнопка номер 4( во втором ряду)
        inlineKeyboardButton3.setText("ЦЕМ II/А-Ш 42,5Н ДО");
        inlineKeyboardButton3.setCallbackData("VOL_CEM2_AS_42DO");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>(); //объединяем 3 и 4 кнопку в ряд(Ряд 2)
        keyboardButtonsRow1.add(inlineKeyboardButton2);
        keyboardButtonsRow1.add(inlineKeyboardButton3);

        InlineKeyboardButton cem_0_52NV = new InlineKeyboardButton(); // кнопка номер 5 (3 ряд)
        cem_0_52NV.setText("ЦЕМ 0 52,5Н / ЦЕМ I 52,5Н(АП/ЖИ/ДП)");
        cem_0_52NV.setCallbackData("VOL_CEM52");

        List<InlineKeyboardButton> keyboardButtonsRow2 = new ArrayList<>(); // создаем еще один ряд и добавляем туда 5-ю кнопку
        keyboardButtonsRow2.add(cem_0_52NV);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow3.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>(); // объединение рядов для нормального отображения, ну или добавление 3-го ряда кнопок
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow2);
        rowList.add(keyboardButtonsRow3);

        inlineKeyboardMarkup.setKeyboard(rowList); // добавляем их в разметку клавиатуры

        SendMessage volMessage = new SendMessage();
        volMessage.setChatId(chatId);
        volMessage.setText("Выберите продукт");
        volMessage.setReplyMarkup(inlineKeyboardMarkup);
        return volMessage;

    }
    //keyboard for cem 1 42 volsk
    public static SendMessage sendVolskCem142InLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("VOL_CEM142N_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("VOL_CEM142N_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cem142VolskMessage = new SendMessage();
        cem142VolskMessage.setChatId(chatId);
        cem142VolskMessage.setText("Выберите документ");
        cem142VolskMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cem142VolskMessage;
    }

    //keyboard for cem 2 volsk
    public static SendMessage sendVolskCemII42InLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("VOL_CEMII42N_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("VOL_CEMII42N_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cem242VolskMessage = new SendMessage();
        cem242VolskMessage.setChatId(chatId);
        cem242VolskMessage.setText("Выберите документ");
        cem242VolskMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cem242VolskMessage;
    }

    //keyboar for cem 2 volsk A-S
    public static SendMessage sendVolskCemIIAS42InLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("VOL_CEMIIAS42N_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("VOL_CEMIIAS42N_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cem2AS42VolskMessage = new SendMessage();
        cem2AS42VolskMessage.setChatId(chatId);
        cem2AS42VolskMessage.setText("Выберите документ");
        cem2AS42VolskMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cem2AS42VolskMessage;
    }

    //keyboard for CEMIIAS42D0
    public static SendMessage sendVolskCemIIAS42DOInLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("VOL_CEMIIAS42NDO_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("VOL_CEMIIAS42NDO_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cem2AS42DOVolskMessage = new SendMessage();
        cem2AS42DOVolskMessage.setChatId(chatId);
        cem2AS42DOVolskMessage.setText("Выберите документ");
        cem2AS42DOVolskMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cem2AS42DOVolskMessage;
    }

    //keyboard for cem0/N volsk
    public static SendMessage sendVolskCEM52InLineKeyboardMessage(long chatId) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();  //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();   //  кнопка номер раз
        inlineKeyboardButton.setText("ЦЕМ 0 52,5Н");
        inlineKeyboardButton.setCallbackData("VOL_CEM0_52N");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton(); //кнопка номер два
        inlineKeyboardButton1.setText("ЦЕМ I 52,5Н AП");
        inlineKeyboardButton1.setCallbackData("VOL_CEMI_52N_AP");


        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>(); // объединяем их в ряд
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton inlineKeyboardButton2 = new InlineKeyboardButton(); //кнопка номер 3(2 ряд)
        inlineKeyboardButton2.setText("ЦЕМ I 52,5Н ДП");
        inlineKeyboardButton2.setCallbackData("VOL_CEMI_52N_DP");

        InlineKeyboardButton inlineKeyboardButton3 = new InlineKeyboardButton(); // кнопка номер 4( во втором ряду)
        inlineKeyboardButton3.setText("ЦЕМ I 52,5Н ЖИ");
        inlineKeyboardButton3.setCallbackData("VOL_CEMI_52N_ZI");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>(); //объединяем 3 и 4 кнопку в ряд(Ряд 2)
        keyboardButtonsRow1.add(inlineKeyboardButton2);
        keyboardButtonsRow1.add(inlineKeyboardButton3);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow3 = new ArrayList<>();
        keyboardButtonsRow3.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>(); // объединение рядов для нормального отображения, ну или добавление 3-го ряда кнопок
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);
        rowList.add(keyboardButtonsRow3);

        inlineKeyboardMarkup.setKeyboard(rowList); // добавляем их в разметку клавиатуры

        SendMessage volskCEM52 = new SendMessage();
        volskCEM52.setChatId(chatId);
        volskCEM52.setText("Выберите продукт");
        volskCEM52.setReplyMarkup(inlineKeyboardMarkup);
        return volskCEM52;

    }

    //keyboard for CEM 0 52,5
    public static SendMessage sendVolskCem052InLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("VOL_CEM052N_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("VOL_CEM052N_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cem052NVolskMessage = new SendMessage();
        cem052NVolskMessage.setChatId(chatId);
        cem052NVolskMessage.setText("Выберите документ");
        cem052NVolskMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cem052NVolskMessage;
    }

    //keyboard for CEM I 52 AP
    public static SendMessage sendVolskCemI52APInLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("VOL_CEMI52_AP_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("VOL_CEMI52_AP_cc");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cemI52APVolskMessage = new SendMessage();
        cemI52APVolskMessage.setChatId(chatId);
        cemI52APVolskMessage.setText("Выберите документ");
        cemI52APVolskMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cemI52APVolskMessage;
    }
    //Keyboard for CEM I 52 DP
    public static SendMessage sendVolskCemI52DPPInLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("VOL_CEMI52_DP_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("VOL_CEMI52_DP_tech");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cemI52DPVolskMessage = new SendMessage();
        cemI52DPVolskMessage.setChatId(chatId);
        cemI52DPVolskMessage.setText("Выберите документ");
        cemI52DPVolskMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cemI52DPVolskMessage;
    }
    //keyboard for CEM I 52 ZI
    public static SendMessage sendVolskCemI52ZIPInLineKeyboardMessage(long chatId){
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup(); //разметка клавиатуры

        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("VOL_CEMI52_ZI_tech");

        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("VOL_CEMI52_ZI_tech");

        List<InlineKeyboardButton> keyboardButtonsRow = new ArrayList<>();
        keyboardButtonsRow.add(inlineKeyboardButton);
        keyboardButtonsRow.add(inlineKeyboardButton1);

        InlineKeyboardButton back = new InlineKeyboardButton(); // кнопка в начало
        back.setText("В начало/К выбору категории продукта");
        back.setCallbackData("toStart");

        List<InlineKeyboardButton> keyboardButtonsRow1 = new ArrayList<>();
        keyboardButtonsRow1.add(back);

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        rowList.add(keyboardButtonsRow);
        rowList.add(keyboardButtonsRow1);

        inlineKeyboardMarkup.setKeyboard(rowList);

        SendMessage cemI52ZIVolskMessage = new SendMessage();
        cemI52ZIVolskMessage.setChatId(chatId);
        cemI52ZIVolskMessage.setText("Выберите документ");
        cemI52ZIVolskMessage.setReplyMarkup(inlineKeyboardMarkup);
        return cemI52ZIVolskMessage;
    }




    // keyboard for Cem2Bfer
    public static SendMessage sendCem2BFerInLineKeyboardMessage(long chatId) {
        InlineKeyboardMarkup markupInline1 = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("cem2B_tech_properties");
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("cem2B_certificate");
        rowInline.add(inlineKeyboardButton);
        rowInline.add(inlineKeyboardButton1);

        // Set the keyboard to the markup
        rowsInline.add(rowInline);
        // Add it to the message
        markupInline1.setKeyboard(rowsInline);
        SendMessage cem2Message = new SendMessage();
        cem2Message.setChatId(chatId);
        cem2Message.setText("Выберите нужные документы");
        cem2Message.setReplyMarkup(markupInline1);
        return  cem2Message;
    }

    //keyboar for cem1Bfer
    public static SendMessage sendCem1BFerInLineKeyboardMessage(long chatId) {
        InlineKeyboardMarkup markupInline1 = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton = new InlineKeyboardButton();
        inlineKeyboardButton.setText("Тех. описание");
        inlineKeyboardButton.setCallbackData("cem1B_tech_properties");
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Сертификат соответствия");
        inlineKeyboardButton1.setCallbackData("cem1B_certificate");
        rowInline.add(inlineKeyboardButton);
        rowInline.add(inlineKeyboardButton1);

        // Set the keyboard to the markup
        rowsInline.add(rowInline);
        // Add it to the message
        markupInline1.setKeyboard(rowsInline);
        SendMessage cem2Message = new SendMessage();
        cem2Message.setChatId(chatId);
        cem2Message.setText("Выберите нужные документы");
        cem2Message.setReplyMarkup(markupInline1);
        return  cem2Message;
    }


    //sendMessage for default before
    public static SendMessage notComplited(long chatId){
        SendMessage notReady = new SendMessage();
        notReady.setChatId(chatId);
        notReady.setText("Упс, данный раздел еще не готов, возможно все будет готово чуть попозже, поробуйте что-нибудь другое:(...например ЦЕМ 1 или ЦЕМ 2...");
        return notReady;
    }


    @Override
    public String getBotUsername() {
        return "TMToolsForExpertBot";
    }

    @Override
    public String getBotToken() {
        return "5343949304:AAEf_uJgA8TNe6HF2WdcDJRPxCszu-LWjfc";
    }
}