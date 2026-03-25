import javax.swing.*; // Swing kütüphanesini içe aktarıyor.
import java.awt.*; // AWT kütüphanesini içe aktarıyor.

public class çalıştır {
    
    private postane postane; // Postane nesnesi oluşturuyor.
    private bildirimsistem bildirimSistemi; // Bildirim sistemi nesnesi oluşturuyor.
    private subevedepo şubeVeDepo; // Şube ve depo yönetim nesnesi oluşturuyor.
    private personel[] personeller; // Personel dizisi oluşturuyor.
    private int personelSayisi; // Personel sayısını tutmak için bir değişken oluşturuyor.

    public çalıştır() {
        postane = new postane(); // Postane nesnesi başlatıyor.
        bildirimSistemi = new bildirimsistem(); // Bildirim sistemi nesnesi başlatıyor.
        şubeVeDepo = new subevedepo(); // Şube ve depo nesnesi başlatıyor.
        personeller = new personel[100]; // 100 elemanlık personel dizisi oluşturuyor.
        personelSayisi = 0; // Başlangıçta personel sayısını sıfır yapıyor.
        
        initializeData(); // Verileri başlatmak için çağırıyor.
        initializeGUI(); // Kullanıcı arayüzünü başlatmak için çağırıyor.
    }

    private void initializeData() {
       
        String[] iller = {"İstanbul", "Ankara", "İzmir", "Bursa", "Antalya", "Kocaeli", "Adana", "Konya",
                "Gaziantep", "Mersin", "Kayseri", "Eskişehir", "Diyarbakır", "Samsun", "Trabzon"};
        // Türkiye'deki çeşitli illeri içeren bir dizi oluşturuyor.
        
        for (String il : iller) { // Her il için döngüye giriyor.
            for (int i = 1; i <= 2; i++) { // Her ilde iki şube ve depo eklemek için döngü.
                şubeVeDepo.şubeEkle(new sube(il + " Şube " + i, il + " Adres " + i, "Telefon " + i));
                // Her il için yeni bir şube ekliyor.
                şubeVeDepo.depoEkle(new depo(il + " Depo " + i, il + " Adres " + i, 1000 + i * 100));
                // Her il için yeni bir depo ekliyor.
            }
        }

        String[] buyukIller = {"İstanbul", "Ankara", "İzmir", "Bursa", "Antalya"};
        // Daha büyük illeri içeren bir dizi oluşturuyor.
        for (String buyukIl : buyukIller) { // Büyük iller için döngü.
            for (int i = 3; i <= 5; i++) { // Bu illerde üç şube ve depo eklemek için döngü.
                şubeVeDepo.şubeEkle(new sube(buyukIl + " Şube " + i, buyukIl + " Adres " + i, "Telefon " + i));
                // Büyük iller için yeni şubeler ekliyor.
                şubeVeDepo.depoEkle(new depo(buyukIl + " Depo " + i, buyukIl + " Adres " + i, 1000 + i * 100));
                // Büyük iller için yeni depolar ekliyor.
            }
        }
    }

    private void initializeGUI() {
        JFrame frame = new JFrame("Postane Otomasyonu"); // Ana pencereyi oluşturuyor.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Kapatma işlemini ayarlıyor.
        frame.setSize(1000, 600); // Pencere boyutunu belirliyor.
        frame.setLayout(new GridBagLayout()); // GridBagLayout düzenini ayarlıyor.
        GridBagConstraints gbc = new GridBagConstraints(); // Düzen sınırlayıcılarını ayarlıyor.
        gbc.fill = GridBagConstraints.HORIZONTAL; // Yatayda doldurma seçeneğini belirliyor.
        gbc.insets = new Insets(10, 10, 10, 10); // Kenar boşluklarını belirliyor.

        JTabbedPane tabbedPane = new JTabbedPane(); // Sekmeli panel oluşturuyor.

        JPanel panelPosta = new JPanel(); // Posta işlemleri paneli oluşturuyor.
        panelPosta.setLayout(new GridBagLayout()); // Panel düzenini ayarlıyor.
        panelPosta.setBackground(Color.LIGHT_GRAY); // Panel arka plan rengini ayarlıyor.

        JButton postaEkleBtn = new JButton("Posta Ekle"); // "Posta Ekle" düğmesi oluşturuyor.
        postaEkleBtn.addActionListener(e -> postaEkle()); // Düğmeye tıklama dinleyicisi ekliyor.
        postaEkleBtn.setBackground(Color.WHITE); // Düğme arka plan rengini ayarlıyor.
        gbc.gridx = 0; // GridBagConstraints'in x koordinatını belirliyor.
        gbc.gridy = 0; // GridBagConstraints'in y koordinatını belirliyor.
        panelPosta.add(postaEkleBtn, gbc); // Düğmeyi panelPosta'ya ekliyor.

        JButton postaListeleBtn = new JButton("Postaları Listele"); // "Postaları Listele" düğmesi oluşturuyor.
        postaListeleBtn.addActionListener(e -> postaListele()); // Düğmeye tıklama dinleyicisi ekliyor.
        postaListeleBtn.setBackground(Color.WHITE); // Düğme arka plan rengini ayarlıyor.
        gbc.gridy = 1; // GridBagConstraints'in y koordinatını belirliyor.
        panelPosta.add(postaListeleBtn, gbc); // Düğmeyi panelPosta'ya ekliyor.

        JButton postaDurumuGuncelleBtn = new JButton("Posta Durumu Güncelle"); // "Posta Durumu Güncelle" düğmesi oluşturuyor.
        postaDurumuGuncelleBtn.addActionListener(e -> postaDurumuGuncelle()); // Düğmeye tıklama dinleyicisi ekliyor.
        postaDurumuGuncelleBtn.setBackground(Color.WHITE); // Düğme arka plan rengini ayarlıyor.
        gbc.gridy = 2; // GridBagConstraints'in y koordinatını belirliyor.
        panelPosta.add(postaDurumuGuncelleBtn, gbc); // Düğmeyi panelPosta'ya ekliyor.

        JButton postaAraBtn = new JButton("Posta Ara"); // "Posta Ara" düğmesi oluşturuyor.
        postaAraBtn.addActionListener(e -> postaAra()); // Düğmeye tıklama dinleyicisi ekliyor.
        postaAraBtn.setBackground(Color.WHITE); // Düğme arka plan rengini ayarlıyor.
        gbc.gridy = 3; // GridBagConstraints'in y koordinatını belirliyor.
        panelPosta.add(postaAraBtn, gbc); // Düğmeyi panelPosta'ya ekliyor.

        JButton faturaOlusturBtn = new JButton("Fatura Oluştur"); // "Fatura Oluştur" düğmesi oluşturuyor.
        faturaOlusturBtn.addActionListener(e -> faturaOlustur()); // Düğmeye tıklama dinleyicisi ekliyor.
        faturaOlusturBtn.setBackground(Color.WHITE); // Düğme arka plan rengini ayarlıyor.
        gbc.gridy = 4; // GridBagConstraints'in y koordinatını belirliyor.
        panelPosta.add(faturaOlusturBtn, gbc); // Düğmeyi panelPosta'ya ekliyor.

        JButton faturaListeleBtn = new JButton("Faturaları Listele"); // "Faturaları Listele" düğmesi oluşturuyor.
        faturaListeleBtn.addActionListener(e -> faturaListele()); // Düğmeye tıklama dinleyicisi ekliyor.
        faturaListeleBtn.setBackground(Color.WHITE); // Düğme arka plan rengini ayarlıyor.
        gbc.gridy = 5; // GridBagConstraints'in y koordinatını belirliyor.
        panelPosta.add(faturaListeleBtn, gbc); // Düğmeyi panelPosta'ya ekliyor.

       JButton gonderiRaporuBtn = new JButton("Gönderi Raporu");
// "Gönderi Raporu" düğmesini oluşturur.
gonderiRaporuBtn.addActionListener(e -> gonderiRaporu());
// "Gönderi Raporu" düğmesine tıklandığında gonderiRaporu() metodunu çağırır.
gonderiRaporuBtn.setBackground(Color.WHITE);
// Düğmenin arka plan rengini beyaz yapar.
gbc.gridy = 6;
// GridBagConstraints'in y koordinatını 6 yapar.
panelPosta.add(gonderiRaporuBtn, gbc);
// "Gönderi Raporu" düğmesini panelPosta'ya ekler.

JButton subeleriListeleBtn = new JButton("Şubeleri Listele");
// "Şubeleri Listele" düğmesini oluşturur.
subeleriListeleBtn.addActionListener(e -> subeleriListele());
// "Şubeleri Listele" düğmesine tıklandığında subeleriListele() metodunu çağırır.
subeleriListeleBtn.setBackground(Color.WHITE);
// Düğmenin arka plan rengini beyaz yapar.
gbc.gridy = 7;
// GridBagConstraints'in y koordinatını 7 yapar.
panelPosta.add(subeleriListeleBtn, gbc);
// "Şubeleri Listele" düğmesini panelPosta'ya ekler.

JButton depolariListeleBtn = new JButton("Depoları Listele");
// "Depoları Listele" düğmesini oluşturur.
depolariListeleBtn.addActionListener(e -> depolariListele());
// "Depoları Listele" düğmesine tıklandığında depolariListele() metodunu çağırır.
depolariListeleBtn.setBackground(Color.WHITE);
// Düğmenin arka plan rengini beyaz yapar.
gbc.gridy = 8;
// GridBagConstraints'in y koordinatını 8 yapar.
panelPosta.add(depolariListeleBtn, gbc);
// "Depoları Listele" düğmesini panelPosta'ya ekler.

JButton personelEkleBtn = new JButton("Personel Ekle");
// "Personel Ekle" düğmesini oluşturur.
personelEkleBtn.addActionListener(e -> personelEkle());
// "Personel Ekle" düğmesine tıklandığında personelEkle() metodunu çağırır.
personelEkleBtn.setBackground(Color.WHITE);
// Düğmenin arka plan rengini beyaz yapar.
gbc.gridy = 9;
// GridBagConstraints'in y koordinatını 9 yapar.
panelPosta.add(personelEkleBtn, gbc);
// "Personel Ekle" düğmesini panelPosta'ya ekler.

JButton personelListeleBtn = new JButton("Personelleri Listele");
// "Personelleri Listele" düğmesini oluşturur.
personelListeleBtn.addActionListener(e -> personelleriListele());
// "Personelleri Listele" düğmesine tıklandığında personelleriListele() metodunu çağırır.
personelListeleBtn.setBackground(Color.WHITE);
// Düğmenin arka plan rengini beyaz yapar.
gbc.gridy = 10;
// GridBagConstraints'in y koordinatını 10 yapar.
panelPosta.add(personelListeleBtn, gbc);
// "Personelleri Listele" düğmesini panelPosta'ya ekler.

JButton cikisBtn = new JButton("Çıkış");
// "Çıkış" düğmesini oluşturur.
cikisBtn.addActionListener(e -> System.exit(0));
// "Çıkış" düğmesine tıklandığında programı sonlandırır.
cikisBtn.setBackground(Color.WHITE);
// Düğmenin arka plan rengini beyaz yapar.
gbc.gridy = 11;
// GridBagConstraints'in y koordinatını 11 yapar.
panelPosta.add(cikisBtn, gbc);
// "Çıkış" düğmesini panelPosta'ya ekler.

tabbedPane.addTab("Postane İşlemleri", panelPosta);
// "Postane İşlemleri" sekmesini tabbedPane'e ekler.
gbc.gridx = 0;
// GridBagConstraints'in x koordinatını 0 yapar.
gbc.gridy = 0;
// GridBagConstraints'in y koordinatını 0 yapar.
gbc.gridwidth = 1;
// GridBagConstraints'in grid genişliğini 1 yapar.
frame.getContentPane().add(tabbedPane, gbc);
// tabbedPane'i ana pencereye ekler.

frame.setVisible(true);
// Ana pencereyi görünür hale getirir.
}

private void postaEkle() {
JTextField gonderenAd = new JTextField(10);
// "Gönderen Ad" için metin alanı oluşturur.
JTextField gonderenSoyad = new JTextField(10);
// "Gönderen Soyad" için metin alanı oluşturur.
JTextField gonderenTcKimlik = new JTextField(10);
// "Gönderen TC Kimlik" için metin alanı oluşturur.
JTextField gonderenTelefon = new JTextField(10);
// "Gönderen Telefon" için metin alanı oluşturur.
JTextField gonderenAdres = new JTextField(10);
// "Gönderen Adres" için metin alanı oluşturur.
JTextField aliciAd = new JTextField(10);
// "Alıcı Ad" için metin alanı oluşturur.
JTextField aliciSoyad = new JTextField(10);
// "Alıcı Soyad" için metin alanı oluşturur.
JTextField aliciTcKimlik = new JTextField(10);
// "Alıcı TC Kimlik" için metin alanı oluşturur.
JTextField aliciTelefon = new JTextField(10);
// "Alıcı Telefon" için metin alanı oluşturur.
JTextField aliciAdres = new JTextField(10);
// "Alıcı Adres" için metin alanı oluşturur.
JTextField turField = new JTextField(10);
// "Tür" için metin alanı oluşturur.
JTextField takipNumarasiField = new JTextField(10);
// "Takip Numarası" için metin alanı oluşturur.
JTextField agirlikField = new JTextField(10);
// "Ağırlık" için metin alanı oluşturur.

JPanel panel = new JPanel(new GridBagLayout());
// GridBagLayout kullanarak bir panel oluşturur.
panel.setBackground(Color.LIGHT_GRAY);
// Panel arka plan rengini açık gri yapar.
GridBagConstraints gbc = new GridBagConstraints();
// GridBagConstraints oluşturur.
gbc.fill = GridBagConstraints.HORIZONTAL;
// Yatayda doldurma seçeneğini belirler.
gbc.insets = new Insets(5, 5, 5, 5);
// Kenar boşluklarını belirler.

gbc.gridx = 0;
// GridBagConstraints'in x koordinatını 0 yapar.
gbc.gridy = 0;
// GridBagConstraints'in y koordinatını 0 yapar.
panel.add(new JLabel("Gönderen Ad:"), gbc);
// "Gönderen Ad" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
// GridBagConstraints'in x koordinatını 1 yapar.
panel.add(gonderenAd, gbc);

gbc.gridx = 0;
// GridBagConstraints'in x koordinatını 0 yapar.
gbc.gridy = 1;
// GridBagConstraints'in y koordinatını 1 yapar.
panel.add(new JLabel("Gönderen Soyad:"), gbc);
// "Gönderen Soyad" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
// GridBagConstraints'in x koordinatını 1 yapar.
panel.add(gonderenSoyad, gbc);

gbc.gridx = 0;
// GridBagConstraints'in x koordinatını 0 yapar.
gbc.gridy = 2;
// GridBagConstraints'in y koordinatını 2 yapar.
panel.add(new JLabel("Gönderen TC Kimlik:"), gbc);
// "Gönderen TC Kimlik" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
// GridBagConstraints'in x koordinatını 1 yapar.
panel.add(gonderenTcKimlik, gbc);

gbc.gridx = 0;
// GridBagConstraints'in x koordinatını 0 yapar.
gbc.gridy = 3;
// GridBagConstraints'in y koordinatını 3 yapar.
panel.add(new JLabel("Gönderen Telefon:"), gbc);
// "Gönderen Telefon" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
// GridBagConstraints'in x koordinatını 1 yapar.
panel.add(gonderenTelefon, gbc);

gbc.gridx = 0;
// GridBagConstraints'in x koordinatını 0 yapar.
gbc.gridy = 4;
// GridBagConstraints'in y koordinatını 4 yapar.
panel.add(new JLabel("Gönderen Adres:"), gbc);
// "Gönderen Adres" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
// GridBagConstraints'in x koordinatını 1 yapar.
panel.add(gonderenAdres, gbc);

gbc.gridx = 0;
gbc.gridy = 5;
panel.add(new JLabel("Alıcı Ad:"), gbc);
// "Alıcı Ad" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
panel.add(aliciAd, gbc);

gbc.gridx = 0;
gbc.gridy = 6;
panel.add(new JLabel("Alıcı Soyad:"), gbc);
// "Alıcı Soyad" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
panel.add(aliciSoyad, gbc);

gbc.gridx = 0;
gbc.gridy = 7;
panel.add(new JLabel("Alıcı TC Kimlik:"), gbc);
// "Alıcı TC Kimlik" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
panel.add(aliciTcKimlik, gbc);

gbc.gridx = 0;
gbc.gridy = 8;
panel.add(new JLabel("Alıcı Telefon:"), gbc);
// "Alıcı Telefon" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
panel.add(aliciTelefon, gbc);

gbc.gridx = 0;
gbc.gridy = 9;
panel.add(new JLabel("Alıcı Adres:"), gbc);
// "Alıcı Adres" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
panel.add(aliciAdres, gbc);

gbc.gridx = 0;
gbc.gridy = 10;
panel.add(new JLabel("Posta Türü:"), gbc);
// "Posta Türü" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
panel.add(turField, gbc);

gbc.gridx = 0;
gbc.gridy = 11;
panel.add(new JLabel("Takip Numarası:"), gbc);
// "Takip Numarası" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
panel.add(takipNumarasiField, gbc);

gbc.gridx = 0;
gbc.gridy = 12;
panel.add(new JLabel("Ağırlık:"), gbc);
// "Ağırlık" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
panel.add(agirlikField, gbc);

int result = JOptionPane.showConfirmDialog(null, panel, "Posta Ekle", JOptionPane.OK_CANCEL_OPTION);
// Kullanıcıya doğrulama diyalog penceresi gösterir.
if (result == JOptionPane.OK_OPTION) { 
    // Kullanıcı OK butonuna tıkladığında
    kişi gonderen = new kişi(gonderenAd.getText(), gonderenSoyad.getText(),
    gonderenTcKimlik.getText(), gonderenTelefon.getText(), gonderenAdres.getText());
    // Gönderen bilgileriyle yeni bir kişi nesnesi oluşturur.
    
    kişi alici = new kişi(aliciAd.getText(), aliciSoyad.getText(), aliciTcKimlik.getText(),
    aliciTelefon.getText(), aliciAdres.getText());
    // Alıcı bilgileriyle yeni bir kişi nesnesi oluşturur.
    
    postaturu tur = postaturu.valueOf(turField.getText().toUpperCase());
    // Posta türünü belirler.
    int takipNumarasi = Integer.parseInt(takipNumarasiField.getText());
    // Takip numarasını belirler.
    double agirlik = Double.parseDouble(agirlikField.getText());
    // Posta ağırlığını belirler.

    posta yeniPosta = new posta(takipNumarasi, gonderen, alici, "Beklemede", tur, agirlik);
    // Yeni posta nesnesi oluşturur.
    postane.postaEkle(yeniPosta);
    // Yeni postayı postane nesnesine ekler.
    bildirimSistemi.gonderiDurumBildirim(yeniPosta);
    // Bildirim sistemine yeni posta durumunu bildirir.
}
}

private void postaDurumuGuncelle() {
JTextField takipNumarasiField = new JTextField(10);
// "Takip Numarası" için metin alanı oluşturur.
JTextField yeniDurumField = new JTextField(10);
// "Yeni Durum" için metin alanı oluşturur.

JPanel panel = new JPanel(new GridBagLayout());
// GridBagLayout kullanarak bir panel oluşturur.
panel.setBackground(Color.LIGHT_GRAY);
// Panel arka plan rengini açık gri yapar.
GridBagConstraints gbc = new GridBagConstraints();
// GridBagConstraints oluşturur.
gbc.fill = GridBagConstraints.HORIZONTAL;
// Yatayda doldurma seçeneğini belirler.
gbc.insets = new Insets(5, 5, 5, 5);
// Kenar boşluklarını belirler.

gbc.gridx = 0;
// GridBagConstraints'in x koordinatını 0 yapar.
gbc.gridy = 0;
// GridBagConstraints'in y koordinatını 0 yapar.
panel.add(new JLabel("Takip Numarası:"), gbc);
// "Takip Numarası" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
// GridBagConstraints'in x koordinatını 1 yapar.
panel.add(takipNumarasiField, gbc);

gbc.gridx = 0;
// GridBagConstraints'in x koordinatını 0 yapar.
gbc.gridy = 1;
// GridBagConstraints'in y koordinatını 1 yapar.
panel.add(new JLabel("Yeni Durum:"), gbc);
// "Yeni Durum" etiketi ve metin alanını panele ekler.
gbc.gridx = 1;
// GridBagConstraints'in x koordinatını 1 yapar.
panel.add(yeniDurumField, gbc);

int result = JOptionPane.showConfirmDialog(null, panel, "Posta Durumu Güncelle", JOptionPane.OK_CANCEL_OPTION);
// Kullanıcıya doğrulama diyalog penceresi gösterir.
if (result == JOptionPane.OK_OPTION) { 
    // Kullanıcı OK butonuna tıkladığında
    int takipNumarasi = Integer.parseInt(takipNumarasiField.getText());
    // Takip numarasını belirler.
    String yeniDurum = yeniDurumField.getText();
    // Yeni durumu belirler.

    postane.postaDurumuGuncelle(takipNumarasi, yeniDurum);
    // Takip numarasına göre postanın durumunu günceller.
    bildirimSistemi.gonderiDurumBildirim(postane.postaAra(takipNumarasi));
    // Bildirim sistemine güncellenen posta durumunu bildirir.
}
}
private void postaAra() {
    String takipNumarasi = JOptionPane.showInputDialog("Takip Numarası Girin:");
    // Kullanıcıdan bir takip numarası girmesini ister.
    if (takipNumarasi != null) {
        // Kullanıcı bir takip numarası girdiyse
        posta bulunanPosta = postane.postaAra(Integer.parseInt(takipNumarasi));
        // Postane nesnesi içinde takip numarasıyla postayı arar.
        if (bulunanPosta != null) {
            // Eğer posta bulunduysa
            JOptionPane.showMessageDialog(null, 
                "Posta Bulundu: " + bulunanPosta.getTakipNumarasi() +
                ", Gönderen: " + bulunanPosta.getGonderen().getAd() +
                ", Alıcı: " + bulunanPosta.getAlici().getAd() +
                ", Durum: " + bulunanPosta.getDurum() +
                ", Tür: " + bulunanPosta.getTur() +
                ", Ağırlık: " + bulunanPosta.getAgirlik() +
                ", Ücret: " + bulunanPosta.getUcret(), 
                "Posta Bilgileri", JOptionPane.INFORMATION_MESSAGE);
            // Posta bilgilerini bir mesaj kutusunda gösterir.
        } else {
            JOptionPane.showMessageDialog(null, 
                "Posta bulunamadı: " + takipNumarasi, 
                "Hata", JOptionPane.ERROR_MESSAGE);
            // Eğer posta bulunamadıysa hata mesajı gösterir.
        }
    }
}

private void faturaOlustur() {
    JTextField takipNumarasiField = new JTextField(10);
    // "Gönderi Takip Numarası" için metin alanı oluşturur.
    JTextField tutarField = new JTextField(10);
    // "Tutar" için metin alanı oluşturur.
    JTextField odemeTuruField = new JTextField(10);
    // "Ödeme Türü" için metin alanı oluşturur.

    JPanel panel = new JPanel(new GridBagLayout());
    // GridBagLayout kullanarak bir panel oluşturur.
    panel.setBackground(Color.LIGHT_GRAY);
    // Panel arka plan rengini açık gri yapar.
    GridBagConstraints gbc = new GridBagConstraints();
    // GridBagConstraints oluşturur.
    gbc.fill = GridBagConstraints.HORIZONTAL;
    // Yatayda doldurma seçeneğini belirler.
    gbc.insets = new Insets(5, 5, 5, 5);
    // Kenar boşluklarını belirler.

    gbc.gridx = 0;
    gbc.gridy = 0;
    panel.add(new JLabel("Gönderi Takip Numarası:"), gbc);
    // "Gönderi Takip Numarası" etiketi ve metin alanını panele ekler.
    gbc.gridx = 1;
    panel.add(takipNumarasiField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    panel.add(new JLabel("Tutar:"), gbc);
    // "Tutar" etiketi ve metin alanını panele ekler.
    gbc.gridx = 1;
    panel.add(tutarField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;
    panel.add(new JLabel("Ödeme Türü:"), gbc);
    // "Ödeme Türü" etiketi ve metin alanını panele ekler.
    gbc.gridx = 1;
    panel.add(odemeTuruField, gbc);

    int result = JOptionPane.showConfirmDialog(null, panel, "Fatura Oluştur", JOptionPane.OK_CANCEL_OPTION);
    // Kullanıcıya doğrulama diyalog penceresi gösterir.
    if (result == JOptionPane.OK_OPTION) {
        // Kullanıcı OK butonuna tıkladığında
        int takipNumarasi = Integer.parseInt(takipNumarasiField.getText());
        // Takip numarasını belirler.
        double tutar = Double.parseDouble(tutarField.getText());
        // Tutarı belirler.
        String odemeTuru = odemeTuruField.getText();
        // Ödeme türünü belirler.
        posta faturaPosta = postane.postaAra(takipNumarasi);
        // Takip numarasına göre postayı arar.

        if (faturaPosta != null) {
            // Eğer posta bulunduysa
            postane.faturaOlustur(faturaPosta, tutar, odemeTuru);
            // Fatura oluşturur.
            JOptionPane.showMessageDialog(null, 
                "Fatura oluşturuldu: " + faturaPosta.getTakipNumarasi());
            // Fatura oluşturulduğunu belirten mesaj gösterir.
        } else {
            JOptionPane.showMessageDialog(null, 
                "Gönderi bulunamadı: " + takipNumarasi, 
                "Hata", JOptionPane.ERROR_MESSAGE);
            // Eğer posta bulunamadıysa hata mesajı gösterir.
        }
    }
}

private void postaListele() {
    StringBuilder sb = new StringBuilder();
    // StringBuilder kullanarak bir metin oluşturur.
    posta[] postalar = postane.getPostalar();
    // Postane nesnesindeki tüm postaları alır.
    boolean empty = true;
    // Başlangıçta postaların boş olduğunu varsayar.

    for (posta posta1 : postalar) {
        if (posta1 != null) {
            // Eğer posta varsa
            empty = false;
            sb.append("Takip Numarası: ").append(posta1.getTakipNumarasi())
                .append(", Gönderen: ").append(posta1.getGonderen().getAd())
                .append(", Alıcı: ").append(posta1.getAlici().getAd())
                .append(", Durum: ").append(posta1.getDurum())
                .append(", Tür: ").append(posta1.getTur())
                .append(", Ağırlık: ").append(posta1.getAgirlik())
                .append(", Ücret: ").append(posta1.getUcret()).append("\n");
            // Posta bilgilerini metne ekler.
        }
    }
    if (empty) {
        sb.append("Hiç posta bulunmamaktadır.");
        // Eğer hiç posta yoksa bilgi verir.
    }

    JTextArea textArea = new JTextArea(sb.toString());
    textArea.setBackground(Color.LIGHT_GRAY);
    textArea.setForeground(Color.BLACK);
    JScrollPane scrollPane = new JScrollPane(textArea);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    scrollPane.setPreferredSize(new Dimension(500, 300));
    JOptionPane.showMessageDialog(null, scrollPane, "Posta Listesi", JOptionPane.INFORMATION_MESSAGE);
    // Posta listesini bir mesaj kutusunda gösterir.
}

private void faturaListele() {
    StringBuilder sb = new StringBuilder();
    fatura[] faturalar = postane.getFaturalar();
    // Postane nesnesindeki tüm faturaları alır.
    boolean empty = true;
    // Başlangıçta faturaların boş olduğunu varsayar.

    for (fatura fatura1 : faturalar) {
        if (fatura1 != null) {
            // Eğer fatura varsa
            empty = false;
            sb.append(fatura1.toString()).append("\n");
            // Fatura bilgilerini metne ekler.
        }
    }
    if (empty) {
        sb.append("Hiç fatura bulunmamaktadır.");
        // Eğer hiç fatura yoksa bilgi verir.
    }

    JTextArea textArea = new JTextArea(sb.toString());
    textArea.setBackground(Color.LIGHT_GRAY);
    textArea.setForeground(Color.BLACK);
    JScrollPane scrollPane = new JScrollPane(textArea);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    scrollPane.setPreferredSize(new Dimension(500, 300));
    JOptionPane.showMessageDialog(null, scrollPane, "Fatura Listesi", JOptionPane.INFORMATION_MESSAGE);
    // Fatura listesini bir mesaj kutusunda gösterir.
}

private void subeleriListele() {
    StringBuilder sb = new StringBuilder();
    // Şubeleri içeren bir StringBuilder oluşturur.
    sube[] şubeler = şubeVeDepo.getŞubeler();
    // Şube ve depo nesnesinden tüm şubeleri alır.
    boolean empty = true;
    // Şubelerin başlangıçta boş olduğunu varsayar.
    for (sube şube1 : şubeler) {
        if (şube1 != null) {
            empty = false;
            sb.append("Şube Adı: ").append(şube1.getAd())
                .append(", Adres: ").append(şube1.getAdres())
                .append(", Telefon: ").append(şube1.getTelefonNumarasi()).append("\n");
            // Şube bilgilerini metne ekler.
        }
    }
    if (empty) {
        sb.append("Hiç şube bulunmamaktadır.");
        // Eğer hiç şube yoksa bilgi verir.
    }

    JTextArea textArea = new JTextArea(sb.toString());
    textArea.setBackground(Color.LIGHT_GRAY);
    textArea.setForeground(Color.BLACK);
    JScrollPane scrollPane = new JScrollPane(textArea);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    scrollPane.setPreferredSize(new Dimension(500, 300));
    JOptionPane.showMessageDialog(null, scrollPane, "Şube Listesi", JOptionPane.INFORMATION_MESSAGE);
    // Şube listesini bir mesaj kutusunda gösterir.
}

private void depolariListele() {
    StringBuilder sb = new StringBuilder();
    // Depoları içeren bir StringBuilder oluşturur.
    depo[] depolar = şubeVeDepo.getDepolar();
    // Şube ve depo nesnesinden tüm depoları alır.
    boolean empty = true;
    // Depoların başlangıçta boş olduğunu varsayar.
    for (depo depo1 : depolar) {
        if (depo1 != null) {
            empty = false;
            sb.append("Depo Adı: ").append(depo1.getAd())
                .append(", Kapasite: ").append(depo1.getKapasite())
                .append(", Mevcut Stok: ").append(depo1.getMevcutStok()).append("\n");
            // Depo bilgilerini metne ekler.
        }
    }
    if (empty) {
        sb.append("Hiç depo bulunmamaktadır.");
        // Eğer hiç depo yoksa bilgi verir.
    }

    JTextArea textArea = new JTextArea(sb.toString());
    textArea.setBackground(Color.LIGHT_GRAY);
    textArea.setForeground(Color.BLACK);
    JScrollPane scrollPane = new JScrollPane(textArea);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    scrollPane.setPreferredSize(new Dimension(500, 300));
    JOptionPane.showMessageDialog(null, scrollPane, "Depo Listesi", JOptionPane.INFORMATION_MESSAGE);
    // Depo listesini bir mesaj kutusunda gösterir.
}

private void gonderiRaporu() {
    int toplamGonderi = 0;
    // Toplam gönderi sayısını tutar.
    int teslimEdilen = 0;
    // Teslim edilen gönderi sayısını tutar.
    for (posta posta1 : postane.getPostalar()) {
        if (posta1 != null) {
            toplamGonderi++;
            if ("Teslim Edildi".equalsIgnoreCase(posta1.getDurum())) {
                teslimEdilen++;
            }
        }
    }
    JOptionPane.showMessageDialog(null, 
        "Toplam Gönderi: " + toplamGonderi + ", Teslim Edilen: " + teslimEdilen, 
        "Gönderi Raporu", JOptionPane.INFORMATION_MESSAGE);
    // Gönderi raporunu bir mesaj kutusunda gösterir.
}

private void personelEkle() {
    JTextField adField = new JTextField(10);
    // "Ad" için metin alanı oluşturur.
    JTextField soyadField = new JTextField(10);
    // "Soyad" için metin alanı oluşturur.
    JTextField tcKimlikField = new JTextField(10);
    // "TC Kimlik" için metin alanı oluşturur.
    JTextField telefonField = new JTextField(10);
    // "Telefon" için metin alanı oluşturur.
    JTextField adresField = new JTextField(10);
    // "Adres" için metin alanı oluşturur.
    JTextField gorevField = new JTextField(10);
    // "Görev" için metin alanı oluşturur.
    JTextField maasField = new JTextField(10);
    // "Maaş" için metin alanı oluşturur.

    JPanel panel = new JPanel(new GridBagLayout());
    // GridBagLayout kullanarak bir panel oluşturur.
    panel.setBackground(Color.LIGHT_GRAY);
    // Panel arka plan rengini açık gri yapar.
    GridBagConstraints gbc = new GridBagConstraints();
    // GridBagConstraints oluşturur.
    gbc.fill = GridBagConstraints.HORIZONTAL;
    // Yatayda doldurma seçeneğini belirler.
    gbc.insets = new Insets(5, 5, 5, 5);
    // Kenar boşluklarını belirler.

    gbc.gridx = 0;
    gbc.gridy = 0;
    panel.add(new JLabel("Ad:"), gbc);
    // "Ad" etiketi ve metin alanını panele ekler.
    gbc.gridx = 1;
    panel.add(adField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    panel.add(new JLabel("Soyad:"), gbc);
    // "Soyad" etiketi ve metin alanını panele ekler.
    gbc.gridx = 1;
    panel.add(soyadField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;
    panel.add(new JLabel("TC Kimlik:"), gbc);
    // "TC Kimlik" etiketi ve metin alanını panele ekler.
    gbc.gridx = 1;
    panel.add(tcKimlikField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    panel.add(new JLabel("Telefon:"), gbc);
    // "Telefon" etiketi ve metin alanını panele ekler.
    gbc.gridx = 1;
    panel.add(telefonField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 4;
    panel.add(new JLabel("Adres:"), gbc);
    // "Adres" etiketi ve metin alanını panele ekler.
    gbc.gridx = 1;
    panel.add(adresField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 5;
    panel.add(new JLabel("Görev:"), gbc);
    // "Görev" etiketi ve metin alanını panele ekler.
    gbc.gridx = 1;
    panel.add(gorevField, gbc);

    gbc.gridx = 0;
    gbc.gridy = 6;
    panel.add(new JLabel("Maaş:"), gbc);
    // "Maaş" etiketi ve metin alanını panele ekler.
    gbc.gridx = 1;
    panel.add(maasField, gbc);

    int result = JOptionPane.showConfirmDialog(null, panel, "Personel Ekle", JOptionPane.OK_CANCEL_OPTION);
    // Kullanıcıya doğrulama diyalog penceresi gösterir.
    if (result == JOptionPane.OK_OPTION) {
        // Kullanıcı OK butonuna tıkladığında
        String ad = adField.getText();
        String soyad = soyadField.getText();
        String tcKimlik = tcKimlikField.getText();
        String telefon = telefonField.getText();
        String adres = adresField.getText();
        String gorev = gorevField.getText();
        double maas = Double.parseDouble(maasField.getText());

        personel yeniPersonel = new personel(ad, soyad, tcKimlik, telefon, adres, gorev, maas);
        // Yeni personel nesnesi oluşturur.
        if (personelSayisi < personeller.length) {
            personeller[personelSayisi++] = yeniPersonel;
            // Yeni personeli personel listesine ekler.
            JOptionPane.showMessageDialog(null, "Personel başarıyla eklendi!");
            // Personelin başarıyla eklendiğini belirtir.
        } else {
            JOptionPane.showMessageDialog(null, "Personel listesi dolu!");
            // Eğer personel listesi doluysa uyarı verir.
        }
    }
}

private void personelListele() {
    StringBuilder sb = new StringBuilder();
    // Personelleri içeren bir StringBuilder oluşturur.
    boolean empty = true;
    // Personellerin başlangıçta boş olduğunu varsayar.
    for (personel personel1 : personeller) {
        if (personel1 != null) {
            empty = false;
            sb.append("Ad: ").append(personel1.getAd())
                .append(", Soyad: ").append(personel1.getSoyad())
                .append(", TC Kimlik: ").append(personel1.getTcKimlikNo())
                .append(", Telefon: ").append(personel1.getTelefon())
                .append(", Adres: ").append(personel1.getAdres())
                .append(", Görev: ").append(personel1.getGorevi())
                .append(", Maaş: ").append(personel1.getMaas()).append("\n");
            // Personel bilgilerini metne ekler.
        }
    }
    if (empty) {
        sb.append("Hiç personel bulunmamaktadır.");
        // Eğer hiç personel yoksa bilgi verir.
    }
    
    JTextArea textArea = new JTextArea(sb.toString());
    textArea.setBackground(Color.LIGHT_GRAY);
    textArea.setForeground(Color.BLACK);
    JScrollPane scrollPane = new JScrollPane(textArea);
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    scrollPane.setPreferredSize(new Dimension(500, 300));
    JOptionPane.showMessageDialog(null, scrollPane, "Personel Listesi", JOptionPane.INFORMATION_MESSAGE);
    // Personel listesini bir mesaj kutusunda gösterir.
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new çalıştır());
    // Programı başlatır.
}

    private void personelleriListele() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}