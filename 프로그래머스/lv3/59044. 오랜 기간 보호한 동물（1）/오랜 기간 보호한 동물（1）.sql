-- 코드를 입력하세요
SELECT 
    I.NAME 
    , I.DATETIME 
FROM (
        SELECT 
            ANIMAL_ID 
            , NAME 
            , DATETIME 
        FROM ANIMAL_INS 
        ORDER BY DATETIME 
    ) I 
LEFT JOIN ANIMAL_OUTS O 
ON I.ANIMAL_ID = O.ANIMAL_ID  
WHERE O.ANIMAL_ID IS NULL AND ROWNUM <= 3;