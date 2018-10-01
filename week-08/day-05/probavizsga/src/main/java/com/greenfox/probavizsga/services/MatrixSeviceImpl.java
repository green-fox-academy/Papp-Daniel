package com.greenfox.probavizsga.services;

import com.greenfox.probavizsga.models.Matrix;
import com.greenfox.probavizsga.repositories.MatrixRepository;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Service
public class MatrixSeviceImpl implements MatrixService {
    private MatrixRepository matrixRepository;

    public MatrixSeviceImpl(MatrixRepository matrixRepository) {
        this.matrixRepository = matrixRepository;
    }

    @Override
    public void addMatrix(String matrix) {
        Matrix matrixModel = new Matrix();
        matrixModel.setMatrix(matrix);
        matrixModel.setCreatedAt(LocalDateTime.now(Clock.systemUTC()));
        matrixRepository.save(matrixModel);
    }

    @Override
    public void validateMatrix(String matrix) {
        List<Integer> singleNumbersInInteger = new ArrayList<>();
        String[] singleNumbers = matrix.split("(?!^)");

        for (int i = 0; i < singleNumbers.length; i++) {
            singleNumbersInInteger.add(Integer.parseInt(singleNumbers[i]));
        }


    }
}
