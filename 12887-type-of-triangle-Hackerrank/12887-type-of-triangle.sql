
SELECT 
CASE
    WHEN A + B <= C OR B + C <= A OR A + C <= B
        THEN 'Not A Triangle'

    WHEN A = B AND B = C
        THEN 'Equilateral'

    WHEN A = B OR B = C OR A = C
        THEN 'Isosceles'

    ELSE 'Scalene'
END AS TriangleType
FROM Triangles;


-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna