-- 코드를 입력하세요
SELECT 
    A.CAR_ID 
    , CASE WHEN A.LENT = 0 THEN '대여 가능' 
        ELSE '대여중' 
        END AS AVAILABILITY 
FROM(
    SELECT 
        CAR_ID 
        , SUM(CASE WHEN TO_CHAR(START_DATE, 'YYYY-MM-DD') <= '2022-10-16' AND 
                TO_CHAR(END_DATE, 'YYYY-MM-DD') >= '2022-10-16' THEN 1 
            ELSE 0 
            END) AS LENT 
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
    GROUP BY CAR_ID 
) A 
ORDER BY CAR_ID DESC;
