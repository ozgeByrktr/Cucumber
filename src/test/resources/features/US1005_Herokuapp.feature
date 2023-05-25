Feature: US1005 kullanici butonlari test eder

  Scenario: TC11 kullanici butonlari ve cikan yazilari test eder

    Given Kullanici "herokuUrl" anasayfaya gider

    Then Add Element butonuna basar

    And Deletebutonu gorunur oluncaya kadar bekler

    And Delete butonunun gorunur oldugunu test eder

    Then  Delete butonuna basarak butonu siler

    And   Delete butonunun gorunmedigini test eder

    And Sayfayi kapatir
