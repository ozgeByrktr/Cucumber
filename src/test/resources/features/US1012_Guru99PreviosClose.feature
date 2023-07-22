Feature: US1012 Kullanici istedigi firmanin onceki gun ki kapanis degerini okur

  @guru
  Scenario: TC18 DCB'nin onceki kapanıs degerini test eder



    Given Kullanici "guruUrl" anasayfaya gider
    And "DCB Bank" Prev.Close degerini yazdirir
    Then Tum sayfa fotografi alir
    And Sayfayi kapatir

