package com.example.demoproject23333.services.Impl;


import com.example.demoproject23333.dto.mapper.MapperResponse;
import com.example.demoproject23333.model.ObjParams;
import com.example.demoproject23333.model.Params;
import com.example.demoproject23333.model.Response;
import com.example.demoproject23333.repositories.ObjParamsRepository;
import com.example.demoproject23333.repositories.ParamsRepository;
import com.example.demoproject23333.repositories.ResponseRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ObjParamsServiceImpl {
    private final ObjParamsRepository objParamsRepository;
    private final ParamsRepository paramsRepository;
    private final ResponseRepository responseRepository;
    private final MapperResponse mapperResponse;
    private final ModelMapper modelMapper;


    public Response saveResponseFromJson(Response response) {

        return responseRepository.save(response);
//        Response response = responseMapper.mapToResponse(responseDto);
//        return responseRepository.save(response);

    }


    public String convertStatus(String objName) {
        List<ObjParams> objParamsList = objParamsRepository.findByObjName(objName);
        StringBuilder statusText = new StringBuilder();

        Optional<ObjParams> firstObjParamsWithParams = objParamsList.stream()
                .filter(objParam -> objParam.getParams() != null)
                .findFirst();

        if (firstObjParamsWithParams.isPresent()) {
            Params params = firstObjParamsWithParams.get().getParams();
            String hexValue = params.getStatus();
            int intValue = Integer.parseInt(hexValue.substring(2), 16);
            String binaryString = Integer.toBinaryString(intValue);
            String binaryStatus = String.format("%16s", binaryString).replace(' ', '0');

            if (binaryStatus.charAt(0) == '1') {
                statusText.append("Признак перезагрузки терминала; ");
            }
            if (binaryStatus.charAt(1) == '1') {
                statusText.append("Номер SIM карты по которой подключен терминал (0-SIM0,1-SIM1); ");
            }
            if (binaryStatus.charAt(2) == '1') {
                statusText.append("Отсутствует соединение с сервером; ");
            }
            if (binaryStatus.charAt(3) == '1') {
                statusText.append("Охраный режим; ");
            }
            if (binaryStatus.charAt(4) == '1') {
                statusText.append("Признак низкого напряжения на аккумуляторе; ");
            }
            if (binaryStatus.charAt(5) == '1') {
                statusText.append("Признак недействительности координат (валидность); ");
            }
            if (binaryStatus.charAt(6) == '1') {
                statusText.append("Координаты зафиксированы при отсутствии движения; ");
            }
            if (binaryStatus.charAt(7) == '1') {
                statusText.append("Отключено внешнее питание терминала; ");
            }
            if (binaryStatus.charAt(8) == '1') {
                statusText.append("Сработка охранной сигнализации ");
            }
            if (binaryStatus.charAt(9) == '1') {
                statusText.append("Обрыв GPS/Глонасс антенны; ");
            }
            if (binaryStatus.charAt(10) == '1') {
                statusText.append("Короткое замыкание GPS/Глонасс антенны; ");
            }
            if (binaryStatus.charAt(11) == '1') {
                statusText.append("Высокое напряжение питания; ");
            }
            if (binaryStatus.charAt(12) == '1') {
                statusText.append("В качестве черного ящика используется SD карта; ");
            }
            if (binaryStatus.charAt(13) == '1') {
                statusText.append("Обнаружено вскрытие корпуса; ");
            }
            if (binaryStatus.charAt(14) == '1') {
                statusText.append("Координаты определенны при помощи базовых станций GSM; ");
            }
            if (binaryStatus.charAt(15) == '1') {
                statusText.append("Нажата кнопка тангенты; ");
            }
        } else {
            statusText.append("отсутствие данных о устройстве; ");
        }
        return statusText.toString().trim();
    }


    public double calculateAverageSpeed(String objName, LocalDate startDate, LocalDate endDate) {
        List<ObjParams> objParamsList = objParamsRepository.findByObjName(objName);
        double totalSpeed = 0.0;
        int count = 0;

        for (ObjParams objParam : objParamsList) {
            LocalDateTime startDateTime = startDate.atStartOfDay();
            LocalDateTime endDateTime = endDate.atTime(LocalTime.MAX);

            List<Params> paramsList = paramsRepository.findByObjParamsAndSpeedTimeBetween(objParam, startDateTime, endDateTime);
            if (!paramsList.isEmpty()) {
                totalSpeed += paramsList.stream()
                        .filter(params -> params.getSpeed() != null && !params.getSpeed().isEmpty())
                        .mapToDouble(params -> Double.parseDouble(params.getSpeed()))
                        .sum();
                count += paramsList.size();
            }
        }

        return count > 0 ? totalSpeed / count : 0.0;
    }
}