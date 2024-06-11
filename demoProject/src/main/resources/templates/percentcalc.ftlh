<!DOCTYPE html>
<html>
<head>
    <title>MedCalcs</title>
</head>
<body>
<a href="/">Главная страница</a></h1><br>
Расчет содержания вещества в растворе (пересчет процентов в миллиграммы)<br>
<#list calcs as calc>
    <div>
        <p>
            <b>${calc.id}</b> ${calc.percent} ${calc.volume} ${calc.calculation}
        </p>
    </div>
</#list>


<hr>
<h3>Создать</h3>

<form action="/percentcalc/сalculate" method="post">
    Процентное содержание, %: <input type="number" name="percent" required="" min=0 max=100 step="0.1"/><br><br>
    Объем ампулы, мл: <input type="number" name="volume" required="" min=0 step="0.1"/><br><br>
    <input type="submit" value="Расчитать"/>
</form>
<br>
Об этом калькуляторе
*Этот калькулятор позволяет пересчитать процентное содержание вещества в заданном объеме раствора в миллиграммы.

Формула
Расчеты исходят из того факта, что 1% любого вещества в среднем соответствует 10 мг вещества в растворе.
Также известно, что 1 мг (миллиграмм) = 1000 мкг (микрограмм), а 1 г (грамм) = 1000 мг (миллиграмм)
</body>
</html>
