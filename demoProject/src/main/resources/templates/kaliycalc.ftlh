<!DOCTYPE html>
<html>
<head>
    <title>MedCalcs</title>
</head>
<body>
<a href="/">Главная страница</a></h1><br>
Расчет дефицита калия<br>

<#list calcs as calc>
    <div>
        <p>
            <b>${calc.id}</b> ${calc.kaliy} ${calc.weight} ${calc.potassium}
        </p>
    </div>
</#list>


<hr>
<h3>Создать</h3>

<form action="/kaliycalc/calculate" method="post">
    Калий сыворотки, ммоль/л: <input type="number" name="kaliy" required="" min=0 step="0.1"/><br><br>
    Вес пациента, кг: <input type="number" name="weight" required="" min=0/><br><br>
    <input type="submit" value="Расчитать"/>
</form>

Об этом калькуляторе
Расчет дефицита калия в плазме крови и объема его возмещения.

Формула
Дефицит калия (ммоль/л) = (5 - калий плазмы пациента в ммоль/л) * 0.2 * массу тела пациента

1 ммоль калия = 39.1 мг калия.

1 грамм калия хлорида (KCL) = 13.4 ммоль калия

Дополнительные сведения
Общая суточная доза не должна превышать более 3 ммоль/кг/сут, а скорость инфузии - 20 ммоль/ч.

Следует знать, что 7,5% - ый раствор KCl является эквимолярным, то есть в 1 миллилтре такого раствора содержится 1 ммоль калия.
</body>
</html>
