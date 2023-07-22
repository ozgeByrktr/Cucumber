Feature:
  Scenario:
  Given Kullanici "aeUrl" anasayfaya gider


    And signUp butonuna basar
    And email kutusuna @isareti olmayan email adresi yazar ve enter’a tiklar
    Then error mesajinin “Invalid email address” oldugunu dogrulayin