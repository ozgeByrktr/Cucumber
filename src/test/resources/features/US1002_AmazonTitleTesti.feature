Feature: US1002 Amazon Title Testi
  @smoke @regression
  Scenario: TC04 kullanici amazon sayfasinin title'nin dogru oldugunu kontrol eder

    Given Kullanici amazon anasayfaya gider

    Then title'in Amazon icerdigini test eder
    And Sayfayi kapatir