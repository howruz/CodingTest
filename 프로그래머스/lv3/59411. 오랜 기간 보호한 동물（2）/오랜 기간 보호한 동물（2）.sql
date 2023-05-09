-- 코드를 입력하세요
SELECT 
    A.ID 
    , A.NAME 
FROM (
        SELECT 
            I.ANIMAL_ID AS ID  
            , I.NAME AS NAME 
            , (O.DATETIME - I.DATETIME) AS DATETIME 
        FROM ANIMAL_INS I 
        JOIN ANIMAL_OUTS O 
        ON I.ANIMAL_ID = O.ANIMAL_ID 
        ORDER BY (O.DATETIME - I.DATETIME) DESC
    ) A 
WHERE ROWNUM <= 2 
ORDER BY A.DATETIME DESC;