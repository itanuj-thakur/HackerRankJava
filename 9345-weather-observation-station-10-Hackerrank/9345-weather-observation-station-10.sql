/*
Enter your query here.
*/
SELECT DISTINCT city
FROM station
WHERE RIGHT(city, 1) NOT IN ('A', 'E', 'I', 'O', 'U');


-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna