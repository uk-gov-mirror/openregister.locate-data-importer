package uk.gov.gds.location.importer.model


case class LocalAuthority(gssCode: String, snacCode: String, onsName: String, custodianCode: String, osName: String)

object LocalAuthorities {

  lazy val localAuthoritiesByCustodianCode = localAuthorities.map(la => la.custodianCode -> la).toMap
  lazy val localAuthoritiesByGssCode = localAuthorities.map(la => la.gssCode -> la).toMap

  val localAuthorities = List(
    LocalAuthority("S12000033", "00QA", "Aberdeen City", "9051", "ABERDEEN CITY"),
    LocalAuthority("S12000034", "00QB", "Aberdeenshire", "9052", "ABERDEENSHIRE"),
    LocalAuthority("E07000223", "45UB", "Adur", "3805", "ADUR"),
    LocalAuthority("E07000026", "16UB", "Allerdale", "905", "ALLERDALE"),
    LocalAuthority("E07000032", "17UB", "Amber Valley", "1005", "AMBER VALLEY"),
    LocalAuthority("S12000041", "00QC", "Angus", "9053", "ANGUS"),
    LocalAuthority("S12000035", "00QD", "Argyll and Bute", "9054", "ARGYLL AND BUTE"),
    LocalAuthority("E07000224", "45UC", "Arun", "3810", "ARUN"),
    LocalAuthority("E07000170", "37UB", "Ashfield", "3005", "ASHFIELD"),
    LocalAuthority("E07000105", "29UB", "Ashford", "2205", "ASHFORD"),
    LocalAuthority("E07000004", "11UB", "Aylesbury Vale", "405", "AYLESBURY VALE"),
    LocalAuthority("E07000200", "42UB", "Babergh", "3505", "BABERGH"),
    LocalAuthority("E09000002", "00AB", "Barking and Dagenham", "5060", "BARKING AND DAGENHAM"),
    LocalAuthority("E09000003", "00AC", "Barnet", "5090", "BARNET"),
    LocalAuthority("E08000016", "00CC", "Barnsley", "4405", "BARNSLEY"),
    LocalAuthority("E07000027", "16UC", "Barrow-in-Furness", "910", "BARROW-IN-FURNESS"),
    LocalAuthority("E07000066", "22UB", "Basildon", "1505", "BASILDON"),
    LocalAuthority("E07000084", "24UB", "Basingstoke and Deane", "1705", "BASINGSTOKE AND DEANE"),
    LocalAuthority("E07000171", "37UC", "Bassetlaw", "3010", "BASSETLAW"),
    LocalAuthority("E06000022", "00HA", "Bath and North East Somerset", "114", "BATH AND NORTH EAST SOMERSET"),
    LocalAuthority("E06000055", "00KB", "Bedford", "235", "BEDFORD"),
    LocalAuthority("E09000004", "00AD", "Bexley", "5120", "BEXLEY"),
    LocalAuthority("E08000025", "00CN", "Birmingham", "4605", "BIRMINGHAM"),
    LocalAuthority("E07000129", "31UB", "Blaby", "2405", "BLABY"),
    LocalAuthority("E06000008", "00EX", "Blackburn", "2372", "BLACKBURN"),
    LocalAuthority("E06000009", "00EY", "Blackpool", "2373", "BLACKPOOL"),
    LocalAuthority("W06000019", "00PL", "Blaenau Gwent", "6910", "BLAENAU GWENT"),
    LocalAuthority("E07000033", "17UC", "Bolsover", "1010", "BOLSOVER"),
    LocalAuthority("E08000001", "00BL", "Bolton", "4205", "BOLTON"),
    LocalAuthority("E07000136", "32UB", "Boston", "2505", "BOSTON"),
    LocalAuthority("E06000028", "00HN", "Bournemouth", "1250", "BOURNEMOUTH"),
    LocalAuthority("E06000036", "00MA", "Bracknell Forest", "335", "BRACKNELL FOREST"),
    LocalAuthority("E08000032", "00CX", "Bradford", "4705", "BRADFORD"),
    LocalAuthority("E07000067", "22UC", "Braintree", "1510", "BRAINTREE"),
    LocalAuthority("E07000143", "33UB", "Breckland", "2605", "BRECKLAND"),
    LocalAuthority("E09000005", "00AE", "Brent", "5150", "BRENT"),
    LocalAuthority("E07000068", "22UD", "Brentwood", "1515", "BRENTWOOD"),
    LocalAuthority("W06000013", "00PB", "Bridgend", "6915", "BRIDGEND"),
    LocalAuthority("E06000043", "00ML", "Brighton and Hove", "1445", "BRIGHTON AND HOVE"),
    LocalAuthority("E06000023", "00HB", "Bristol City", "116", "BRISTOL CITY"),
    LocalAuthority("E07000144", "33UC", "Broadland", "2610", "BROADLAND"),
    LocalAuthority("E09000006", "00AF", "Bromley", "5180", "BROMLEY"),
    LocalAuthority("E07000234", "47UB", "Bromsgrove", "1805", "BROMSGROVE"),
    LocalAuthority("E07000095", "26UB", "Broxbourne", "1905", "BROXBOURNE"),
    LocalAuthority("E07000172", "37UD", "Broxtowe", "3015", "BROXTOWE"),
    LocalAuthority("E07000117", "30UD", "Burnley", "2315", "BURNLEY"),
    LocalAuthority("E08000002", "00BM", "Bury", "4210", "BURY"),
    LocalAuthority("W06000018", "00PK", "Caerphilly", "6920", "CAERPHILLY"),
    LocalAuthority("E08000033", "00CY", "Calderdale", "4710", "CALDERDALE"),
    LocalAuthority("E07000008", "12UB", "Cambridge", "505", "CAMBRIDGE"),
    LocalAuthority("E09000007", "00AG", "Camden", "5210", "CAMDEN"),
    LocalAuthority("E07000192", "41UB", "Cannock Chase", "3405", "CANNOCK CHASE"),
    LocalAuthority("E07000106", "29UC", "Canterbury", "2210", "CANTERBURY"),
    LocalAuthority("W06000015", "00PT", "Cardiff", "6815", "CARDIFF"),
    LocalAuthority("E07000028", "16UD", "Carlisle", "915", "CARLISLE"),
    LocalAuthority("W06000010", "00NU", "Carmarthenshire", "6825", "CARMARTHENSHIRE"),
    LocalAuthority("E07000069", "22UE", "Castle Point", "1520", "CASTLE POINT"),
    LocalAuthority("E06000056", "00KC", "Central Bedfordshire", "240", "CENTRAL BEDFORDSHIRE"),
    LocalAuthority("W06000008", "00NQ", "Ceredigion", "6820", "CEREDIGION"),
    LocalAuthority("E07000130", "31UC", "Charnwood", "2410", "CHARNWOOD"),
    LocalAuthority("E07000070", "22UF", "Chelmsford", "1525", "CHELMSFORD"),
    LocalAuthority("E07000078", "23UB", "Cheltenham", "1605", "CHELTENHAM"),
    LocalAuthority("E07000177", "38UB", "Cherwell", "3105", "CHERWELL"),
    LocalAuthority("E06000049", "00EQ", "Cheshire East", "660", "CHESHIRE EAST"),
    LocalAuthority("E06000050", "00EW", "Cheshire West and Chester", "665", "CHESHIRE WEST AND CHESTER"),
    LocalAuthority("E07000034", "17UD", "Chesterfield", "1015", "CHESTERFIELD"),
    LocalAuthority("E07000225", "45UD", "Chichester", "3815", "CHICHESTER"),
    LocalAuthority("E07000005", "11UC", "Chiltern", "415", "CHILTERN"),
    LocalAuthority("E07000118", "30UE", "Chorley", "2320", "CHORLEY"),
    LocalAuthority("E07000048", "19UC", "Christchurch", "1210", "CHRISTCHURCH"),
    LocalAuthority("S12000036", "00QP", "City of Edinburgh", "9064", "CITY OF EDINBURGH"),
    LocalAuthority("E09000001", "00AA", "City of London", "5030", "CITY OF LONDON"),
    LocalAuthority("S12000005", "00QF", "Clackmannanshire", "9056", "CLACKMANNANSHIRE"),
    LocalAuthority("E07000071", "22UG", "Colchester", "1530", "COLCHESTER"),
    LocalAuthority("W06000003", "00NE", "Conwy", "6905", "CONWY"),
    LocalAuthority("E07000029", "16UE", "Copeland", "920", "COPELAND"),
    LocalAuthority("E07000150", "34UB", "Corby", "2805", "CORBY"),
    LocalAuthority("E06000052", "00HE", "Cornwall", "840", "CORNWALL"),
    LocalAuthority("E07000079", "23UC", "Cotswold", "1610", "COTSWOLD"),
    LocalAuthority("E08000026", "00CQ", "Coventry", "4610", "COVENTRY"),
    LocalAuthority("E07000163", "36UB", "Craven", "2705", "CRAVEN"),
    LocalAuthority("E07000226", "45UE", "Crawley", "3820", "CRAWLEY"),
    LocalAuthority("E09000008", "00AH", "Croydon", "5240", "CROYDON"),
    LocalAuthority("E07000096", "26UC", "Dacorum", "1910", "DACORUM"),
    LocalAuthority("E06000005", "00EH", "Darlington", "1350", "DARLINGTON"),
    LocalAuthority("E07000107", "29UD", "Dartford", "2215", "DARTFORD"),
    LocalAuthority("E07000151", "34UC", "Daventry", "2810", "DAVENTRY"),
    LocalAuthority("W06000004", "00NG", "Denbighshire", "6830", "DENBIGHSHIRE"),
    LocalAuthority("E06000015", "00FK", "Derby", "1055", "DERBY"),
    LocalAuthority("E07000035", "17UF", "Derbyshire Dales", "1045", "DERBYSHIRE DALES"),
    LocalAuthority("E08000017", "00CE", "Doncaster", "4410", "DONCASTER"),
    LocalAuthority("E07000108", "29UE", "Dover", "2220", "DOVER"),
    LocalAuthority("E08000027", "00CR", "Dudley", "4615", "DUDLEY"),
    LocalAuthority("S12000006", "00QH", "Dumfries and Galloway", "9058", "DUMFRIES AND GALLOWAY"),
    LocalAuthority("S12000042", "00QJ", "Dundee City", "9059", "DUNDEE CITY"),
    LocalAuthority("E06000047", "00EJ", "Durham", "1355", "DURHAM"),
    LocalAuthority("E09000009", "00AJ", "Ealing", "5270", "EALING"),
    LocalAuthority("S12000008", "00QK", "East Ayrshire", "9060", "EAST AYRSHIRE"),
    LocalAuthority("E07000009", "12UC", "East Cambridgeshire", "510", "EAST CAMBRIDGESHIRE"),
    LocalAuthority("E07000040", "18UB", "East Devon", "1105", "EAST DEVON"),
    LocalAuthority("E07000049", "19UD", "East Dorset", "1240", "EAST DORSET"),
    LocalAuthority("S12000045", "00QL", "East Dunbartonshire", "9061", "EAST DUNBARTONSHIRE"),
    LocalAuthority("E07000085", "24UC", "East Hampshire", "1710", "EAST HAMPSHIRE"),
    LocalAuthority("E07000242", "26UD", "East Hertfordshire", "1915", "EAST HERTFORDSHIRE"),
    LocalAuthority("E07000137", "32UC", "East Lindsey", "2510", "EAST LINDSEY"),
    LocalAuthority("S12000010", "00QM", "East Lothian", "9062", "EAST LOTHIAN"),
    LocalAuthority("E07000152", "34UD", "East Northamptonshire", "2815", "EAST NORTHAMPTONSHIRE"),
    LocalAuthority("S12000011", "00QN", "East Renfrewshire", "9063", "EAST RENFREWSHIRE"),
    LocalAuthority("E06000011", "00FB", "East Riding of Yorkshire", "2001", "EAST RIDING OF YORKSHIRE"),
    LocalAuthority("E07000193", "41UC", "East Staffordshire", "3410", "EAST STAFFORDSHIRE"),
    LocalAuthority("E07000061", "21UC", "Eastbourne", "1410", "EASTBOURNE"),
    LocalAuthority("E07000086", "24UD", "Eastleigh", "1715", "EASTLEIGH"),
    LocalAuthority("E07000030", "16UF", "Eden", "925", "EDEN"),
    LocalAuthority("S12000013", "00RJ", "Eileanan an Iar", "9020", "Eileanan an Iar"),
    LocalAuthority("E07000207", "43UB", "Elmbridge", "3605", "ELMBRIDGE"),
    LocalAuthority("E09000010", "00AK", "Enfield", "5300", "ENFIELD"),
    LocalAuthority("E07000072", "22UH", "Epping Forest", "1535", "EPPING FOREST"),
    LocalAuthority("E07000208", "43UC", "Epsom and Ewell", "3610", "EPSOM AND EWELL"),
    LocalAuthority("E07000036", "17UG", "Erewash", "1025", "EREWASH"),
    LocalAuthority("E07000041", "18UC", "Exeter", "1110", "EXETER"),
    LocalAuthority("S12000014", "00QQ", "Falkirk", "9065", "FALKIRK"),
    LocalAuthority("E07000087", "24UE", "Fareham", "1720", "FAREHAM"),
    LocalAuthority("E07000010", "12UD", "Fenland", "515", "FENLAND"),
    LocalAuthority("S12000015", "00QR", "Fife", "9066", "FIFE"),
    LocalAuthority("W06000005", "00NJ", "Flintshire", "6835", "FLINTSHIRE"),
    LocalAuthority("E07000201", "42UC", "Forest Heath", "3510", "FOREST HEATH"),
    LocalAuthority("E07000080", "23UD", "Forest of Dean", "1615", "FOREST OF DEAN"),
    LocalAuthority("E07000119", "30UF", "Fylde", "2325", "FYLDE"),
    LocalAuthority("E08000037", "00CH", "Gateshead", "4505", "GATESHEAD"),
    LocalAuthority("E07000173", "37UE", "Gedling", "3020", "GEDLING"),
    LocalAuthority("S12000046", "00QS", "Glasgow City", "9067", "GLASGOW CITY"),
    LocalAuthority("E07000081", "23UE", "Gloucester", "1620", "GLOUCESTER"),
    LocalAuthority("E07000088", "24UF", "Gosport", "1725", "GOSPORT"),
    LocalAuthority("E07000109", "29UG", "Gravesham", "2230", "GRAVESHAM"),
    LocalAuthority("E07000145", "33UD", "Great Yarmouth", "2615", "GREAT YARMOUTH"),
    LocalAuthority("E09000011", "00AL", "Greenwich", "5330", "GREENWICH"),
    LocalAuthority("E07000209", "43UD", "Guildford", "3615", "GUILDFORD"),
    LocalAuthority("W06000002", "00NC", "Gwynedd", "6810", "GWYNEDD"),
    LocalAuthority("E09000012", "00AM", "Hackney", "5360", "HACKNEY"),
    LocalAuthority("E06000006", "00ET", "Halton", "650", "HALTON"),
    LocalAuthority("E07000164", "36UC", "Hambleton", "2710", "HAMBLETON"),
    LocalAuthority("E09000013", "00AN", "Hammersmith and Fulham", "5390", "HAMMERSMITH AND FULHAM"),
    LocalAuthority("E07000131", "31UD", "Harborough", "2415", "HARBOROUGH"),
    LocalAuthority("E09000014", "00AP", "Haringey", "5420", "HARINGEY"),
    LocalAuthority("E07000073", "22UJ", "Harlow", "1540", "HARLOW"),
    LocalAuthority("E07000165", "36UD", "Harrogate", "2715", "HARROGATE"),
    LocalAuthority("E09000015", "00AQ", "Harrow", "5450", "HARROW"),
    LocalAuthority("E07000089", "24UG", "Hart", "1730", "HART"),
    LocalAuthority("E06000001", "00EB", "Hartlepool", "724", "HARTLEPOOL"),
    LocalAuthority("E07000062", "21UD", "Hastings", "1415", "HASTINGS"),
    LocalAuthority("E07000090", "24UH", "Havant", "1735", "HAVANT"),
    LocalAuthority("E09000016", "00AR", "Havering", "5480", "HAVERING"),
    LocalAuthority("E06000019", "00GA", "Herefordshire", "1850", "HEREFORDSHIRE"),
    LocalAuthority("E07000098", "26UE", "Hertsmere", "1920", "HERTSMERE"),
    LocalAuthority("E07000037", "17UH", "High Peak", "1030", "HIGH PEAK"),
    LocalAuthority("S12000017", "00QT", "Highland", "9068", "HIGHLAND"),
    LocalAuthority("E09000017", "00AS", "Hillingdon", "5510", "HILLINGDON"),
    LocalAuthority("E07000132", "31UE", "Hinckley and Bosworth", "2420", "HINCKLEY AND BOSWORTH"),
    LocalAuthority("E07000227", "45UF", "Horsham", "3825", "HORSHAM"),
    LocalAuthority("E09000018", "00AT", "Hounslow", "5540", "HOUNSLOW"),
    LocalAuthority("E07000011", "12UE", "Huntingdonshire", "520", "HUNTINGDONSHIRE"),
    LocalAuthority("E07000120", "30UG", "Hyndburn", "2330", "HYNDBURN"),
    LocalAuthority("S12000018", "00QU", "Inverclyde", "9069", "INVERCLYDE"),
    LocalAuthority("E07000202", "42UD", "Ipswich", "3515", "IPSWICH"),
    LocalAuthority("W06000001", "00NA", "Isle of Anglesey", "6805", "ISLE OF ANGLESEY"),
    LocalAuthority("E06000046", "00MW", "Isle of Wight", "2114", "ISLE OF WIGHT"),
    LocalAuthority("E06000053", "00HF", "Isles of Scilly", "835", "ISLES OF SCILLY"),
    LocalAuthority("E09000019", "00AU", "Islington", "5570", "ISLINGTON"),
    LocalAuthority("E09000020", "00AW", "Kensington and Chelsea", "5600", "KENSINGTON AND CHELSEA"),
    LocalAuthority("E07000153", "34UE", "Kettering", "2820", "KETTERING"),
    LocalAuthority("E07000146", "33UE", "Kings Lynn and West Norfolk", "2635", "KINGS LYNN AND WEST NORFOLK"),
    LocalAuthority("E06000010", "00FA", "Kingston upon Hull", "2004", "KINGSTON UPON HULL"),
    LocalAuthority("E09000021", "00AX", "Kingston upon Thames", "5630", "KINGSTON UPON THAMES"),
    LocalAuthority("E08000034", "00CZ", "Kirklees", "4715", "KIRKLEES"),
    LocalAuthority("E08000011", "00BX", "Knowsley", "4305", "KNOWSLEY"),
    LocalAuthority("E09000022", "00AY", "Lambeth", "5660", "LAMBETH"),
    LocalAuthority("E07000121", "30UH", "Lancaster", "2335", "LANCASTER"),
    LocalAuthority("E08000035", "00DA", "Leeds", "4720", "LEEDS"),
    LocalAuthority("E06000016", "00FN", "Leicester", "2465", "LEICESTER"),
    LocalAuthority("E07000063", "21UF", "Lewes", "1425", "LEWES"),
    LocalAuthority("E09000023", "00AZ", "Lewisham", "5690", "LEWISHAM"),
    LocalAuthority("E07000194", "41UD", "Lichfield", "3415", "LICHFIELD"),
    LocalAuthority("E07000138", "32UD", "Lincoln", "2515", "LINCOLN"),
    LocalAuthority("E08000012", "00BY", "Liverpool", "4310", "LIVERPOOL"),
    LocalAuthority("E06000032", "00KA", "Luton", "230", "LUTON"),
    LocalAuthority("E07000110", "29UH", "Maidstone", "2235", "MAIDSTONE"),
    LocalAuthority("E07000074", "22UK", "Maldon", "1545", "MALDON"),
    LocalAuthority("E07000235", "47UC", "Malvern Hills", "1820", "MALVERN HILLS"),
    LocalAuthority("E08000003", "00BN", "Manchester", "4215", "MANCHESTER"),
    LocalAuthority("E07000174", "37UF", "Mansfield", "3025", "MANSFIELD"),
    LocalAuthority("E06000035", "00LC", "Medway", "2280", "MEDWAY"),
    LocalAuthority("E07000133", "31UG", "Melton", "2430", "MELTON"),
    LocalAuthority("E07000187", "40UB", "Mendip", "3305", "MENDIP"),
    LocalAuthority("W06000024", "00PH", "Merthyr Tydfil", "6925", "MERTHYR TYDFIL"),
    LocalAuthority("E09000024", "00BA", "Merton", "5720", "MERTON"),
    LocalAuthority("E07000042", "18UD", "Mid Devon", "1135", "MID DEVON"),
    LocalAuthority("E07000203", "42UE", "Mid Suffolk", "3520", "MID SUFFOLK"),
    LocalAuthority("E07000228", "45UG", "Mid Sussex", "3830", "MID SUSSEX"),
    LocalAuthority("E06000002", "00EC", "Middlesbrough", "734", "MIDDLESBROUGH"),
    LocalAuthority("S12000019", "00QW", "Midlothian", "9070", "MIDLOTHIAN"),
    LocalAuthority("E06000042", "00MG", "Milton Keynes", "435", "MILTON KEYNES"),
    LocalAuthority("E07000210", "43UE", "Mole Valley", "3620", "MOLE VALLEY"),
    LocalAuthority("W06000021", "00PP", "Monmouthshire", "6840", "MONMOUTHSHIRE"),
    LocalAuthority("S12000020", "00QX", "Moray", "9071", "MORAY"),
    LocalAuthority("W06000012", "00NZ", "Neath Port Talbot", "6930", "NEATH PORT TALBOT"),
    LocalAuthority("E07000091", "24UJ", "New Forest", "1740", "NEW FOREST"),
    LocalAuthority("E07000175", "37UG", "Newark and Sherwood", "3030", "NEWARK AND SHERWOOD"),
    LocalAuthority("E08000021", "00CJ", "Newcastle upon Tyne", "4510", "NEWCASTLE UPON TYNE"),
    LocalAuthority("E07000195", "41UE", "Newcastle-under-Lyme", "3420", "NEWCASTLE-UNDER-LYME"),
    LocalAuthority("E09000025", "00BB", "Newham", "5750", "NEWHAM"),
    LocalAuthority("W06000022", "00PR", "Newport", "6935", "NEWPORT"),
    LocalAuthority("S12000021", "00QY", "North Ayrshire", "9072", "NORTH AYRSHIRE"),
    LocalAuthority("E07000043", "18UE", "North Devon", "1115", "NORTH DEVON"),
    LocalAuthority("E07000050", "19UE", "North Dorset", "1215", "NORTH DORSET"),
    LocalAuthority("E07000038", "17UJ", "North East Derbyshire", "1035", "NORTH EAST DERBYSHIRE"),
    LocalAuthority("E06000012", "00FC", "North East Lincolnshire", "2002", "NORTH EAST LINCOLNSHIRE"),
    LocalAuthority("E07000099", "26UF", "North Hertfordshire", "1925", "NORTH HERTFORDSHIRE"),
    LocalAuthority("E07000139", "32UE", "North Kesteven", "2520", "NORTH KESTEVEN"),
    LocalAuthority("S12000044", "00QZ", "North Lanarkshire", "9073", "NORTH LANARKSHIRE"),
    LocalAuthority("E06000013", "00FD", "North Lincolnshire", "2003", "NORTH LINCOLNSHIRE"),
    LocalAuthority("E07000147", "33UF", "North Norfolk", "2620", "NORTH NORFOLK"),
    LocalAuthority("E06000024", "00HC", "North Somerset", "121", "NORTH SOMERSET"),
    LocalAuthority("E08000022", "00CK", "North Tyneside", "4515", "NORTH TYNESIDE"),
    LocalAuthority("E07000218", "44UB", "North Warwickshire", "3705", "NORTH WARWICKSHIRE"),
    LocalAuthority("E07000134", "31UH", "North West Leicestershire", "2435", "NORTH WEST LEICESTERSHIRE"),
    LocalAuthority("E07000154", "34UF", "Northampton", "2825", "NORTHAMPTON"),
    LocalAuthority("E06000057", "00EM", "Northumberland", "2935", "NORTHUMBERLAND"),
    LocalAuthority("E07000148", "33UG", "Norwich", "2625", "NORWICH"),
    LocalAuthority("E06000018", "00FY", "Nottingham", "3060", "NOTTINGHAM"),
    LocalAuthority("E07000219", "44UC", "Nuneaton and Bedworth", "3710", "NUNEATON AND BEDWORTH"),
    LocalAuthority("E07000135", "31UJ", "Oadby and Wigston", "2440", "OADBY AND WIGSTON"),
    LocalAuthority("E08000004", "00BP", "Oldham", "4220", "OLDHAM"),
    LocalAuthority("S12000023", "00RA", "Orkney Islands", "9000", "ORKNEY ISLANDS"),
    LocalAuthority("E07000178", "38UC", "Oxford", "3110", "OXFORD"),
    LocalAuthority("W06000009", "00NS", "Pembrokeshire", "6845", "PEMBROKESHIRE"),
    LocalAuthority("E07000122", "30UJ", "Pendle", "2340", "PENDLE"),
    LocalAuthority("S12000024", "00RB", "Perth and Kinross", "9074", "PERTH AND KINROSS"),
    LocalAuthority("E06000031", "00JA", "Peterborough", "540", "PETERBOROUGH"),
    LocalAuthority("E06000026", "00HG", "Plymouth", "1160", "PLYMOUTH"),
    LocalAuthority("E06000029", "00HP", "Poole", "1255", "POOLE"),
    LocalAuthority("E06000044", "00MR", "Portsmouth", "1775", "PORTSMOUTH"),
    LocalAuthority("W06000023", "00NN", "Powys", "6850", "POWYS"),
    LocalAuthority("E07000123", "30UK", "Preston", "2345", "PRESTON"),
    LocalAuthority("E07000051", "19UG", "Purbeck", "1225", "PURBECK"),
    LocalAuthority("E06000038", "00MC", "Reading", "345", "READING"),
    LocalAuthority("E09000026", "00BC", "Redbridge", "5780", "REDBRIDGE"),
    LocalAuthority("E06000003", "00EE", "Redcar and Cleveland", "728", "REDCAR AND CLEVELAND"),
    LocalAuthority("E07000236", "47UD", "Redditch", "1825", "REDDITCH"),
    LocalAuthority("E07000211", "43UF", "Reigate and Banstead", "3625", "REIGATE AND BANSTEAD"),
    LocalAuthority("S12000038", "00RC", "Renfrewshire", "9075", "RENFREWSHIRE"),
    LocalAuthority("W06000016", "00PF", "Rhondda Cynon Taf", "6940", "RHONDDA CYNON TAF"),
    LocalAuthority("E07000124", "30UL", "Ribble Valley", "2350", "RIBBLE VALLEY"),
    LocalAuthority("E09000027", "00BD", "Richmond upon Thames", "5810", "RICHMOND UPON THAMES"),
    LocalAuthority("E07000166", "36UE", "Richmondshire", "2720", "RICHMONDSHIRE"),
    LocalAuthority("E08000005", "00BQ", "Rochdale", "4225", "ROCHDALE"),
    LocalAuthority("E07000075", "22UL", "Rochford", "1550", "ROCHFORD"),
    LocalAuthority("E07000125", "30UM", "Rossendale", "2355", "ROSSENDALE"),
    LocalAuthority("E07000064", "21UG", "Rother", "1430", "ROTHER"),
    LocalAuthority("E08000018", "00CF", "Rotherham", "4415", "ROTHERHAM"),
    LocalAuthority("E07000220", "44UD", "Rugby", "3715", "RUGBY"),
    LocalAuthority("E07000212", "43UG", "Runnymede", "3630", "RUNNYMEDE"),
    LocalAuthority("E07000176", "37UJ", "Rushcliffe", "3040", "RUSHCLIFFE"),
    LocalAuthority("E07000092", "24UL", "Rushmoor", "1750", "RUSHMOOR"),
    LocalAuthority("E06000017", "00FP", "Rutland", "2470", "RUTLAND"),
    LocalAuthority("E07000167", "36UF", "Ryedale", "2725", "RYEDALE"),
    LocalAuthority("E08000006", "00BR", "Salford", "4230", "SALFORD"),
    LocalAuthority("E08000028", "00CS", "Sandwell", "4620", "SANDWELL"),
    LocalAuthority("E07000168", "36UG", "Scarborough", "2730", "SCARBOROUGH"),
    LocalAuthority("S12000026", "00QE", "Scottish Borders", "9055", "SCOTTISH BORDERS"),
    LocalAuthority("E07000188", "40UC", "Sedgemoor", "3310", "SEDGEMOOR"),
    LocalAuthority("E08000014", "00CA", "Sefton", "4320", "SEFTON"),
    LocalAuthority("E07000169", "36UH", "Selby", "2735", "SELBY"),
    LocalAuthority("E07000111", "29UK", "Sevenoaks", "2245", "SEVENOAKS"),
    LocalAuthority("E08000019", "00CG", "Sheffield", "4420", "SHEFFIELD"),
    LocalAuthority("E07000112", "29UL", "Shepway", "2250", "SHEPWAY"),
    LocalAuthority("S12000027", "00RD", "Shetland Islands", "9010", "SHETLAND ISLANDS"),
    LocalAuthority("E06000051", "00GG", "Shropshire", "3245", "SHROPSHIRE"),
    LocalAuthority("E06000039", "00MD", "Slough", "350", "SLOUGH"),
    LocalAuthority("E08000029", "00CT", "Solihull", "4625", "SOLIHULL"),
    LocalAuthority("S12000028", "00RE", "South Ayrshire", "9076", "SOUTH AYRSHIRE"),
    LocalAuthority("E07000006", "11UE", "South Bucks", "410", "SOUTH BUCKS"),
    LocalAuthority("E07000012", "12UG", "South Cambridgeshire", "530", "SOUTH CAMBRIDGESHIRE"),
    LocalAuthority("E07000039", "17UK", "South Derbyshire", "1040", "SOUTH DERBYSHIRE"),
    LocalAuthority("E06000025", "00HD", "South Gloucestershire", "119", "SOUTH GLOUCESTERSHIRE"),
    LocalAuthority("E07000044", "18UG", "South Hams", "1125", "SOUTH HAMS"),
    LocalAuthority("E07000140", "32UF", "South Holland", "2525", "SOUTH HOLLAND"),
    LocalAuthority("E07000141", "32UG", "South Kesteven", "2530", "SOUTH KESTEVEN"),
    LocalAuthority("E07000031", "16UG", "South Lakeland", "930", "SOUTH LAKELAND"),
    LocalAuthority("S12000029", "00RF", "South Lanarkshire", "9077", "SOUTH LANARKSHIRE"),
    LocalAuthority("E07000149", "33UH", "South Norfolk", "2630", "SOUTH NORFOLK"),
    LocalAuthority("E07000155", "34UG", "South Northamptonshire", "2830", "SOUTH NORTHAMPTONSHIRE"),
    LocalAuthority("E07000179", "38UD", "South Oxfordshire", "3115", "SOUTH OXFORDSHIRE"),
    LocalAuthority("E07000126", "30UN", "South Ribble", "2360", "SOUTH RIBBLE"),
    LocalAuthority("E07000189", "40UD", "South Somerset", "3325", "SOUTH SOMERSET"),
    LocalAuthority("E07000196", "41UF", "South Staffordshire", "3430", "SOUTH STAFFORDSHIRE"),
    LocalAuthority("E08000023", "00CL", "South Tyneside", "4520", "SOUTH TYNESIDE"),
    LocalAuthority("E06000045", "00MS", "Southampton", "1780", "SOUTHAMPTON"),
    LocalAuthority("E06000033", "00KF", "Southend-on-Sea", "1590", "SOUTHEND-ON-SEA"),
    LocalAuthority("E09000028", "00BE", "Southwark", "5840", "SOUTHWARK"),
    LocalAuthority("E07000213", "43UH", "Spelthorne", "3635", "SPELTHORNE"),
    LocalAuthority("E07000240", "26UG", "St Albans", "1930", "ST ALBANS"),
    LocalAuthority("E07000204", "42UF", "St Edmundsbury", "3525", "ST EDMUNDSBURY"),
    LocalAuthority("E08000013", "00BZ", "St Helens", "4315", "ST HELENS"),
    LocalAuthority("E07000197", "41UG", "Stafford", "3425", "STAFFORD"),
    LocalAuthority("E07000198", "41UH", "Staffordshire Moorlands", "3435", "STAFFORDSHIRE MOORLANDS"),
    LocalAuthority("E07000243", "26UH", "Stevenage", "1935", "STEVENAGE"),
    LocalAuthority("S12000030", "00RG", "Stirling", "9078", "STIRLING"),
    LocalAuthority("E08000007", "00BS", "Stockport", "4235", "STOCKPORT"),
    LocalAuthority("E06000004", "00EF", "Stockton-on-Tees", "738", "STOCKTON-ON-TEES"),
    LocalAuthority("E06000021", "00GL", "Stoke-on-Trent", "3455", "STOKE-ON-TRENT"),
    LocalAuthority("E07000221", "44UE", "Stratford-on-Avon", "3720", "STRATFORD-ON-AVON"),
    LocalAuthority("E07000082", "23UF", "Stroud", "1625", "STROUD"),
    LocalAuthority("E07000205", "42UG", "Suffolk Coastal", "3530", "SUFFOLK COASTAL"),
    LocalAuthority("E08000024", "00CM", "Sunderland", "4525", "SUNDERLAND"),
    LocalAuthority("E07000214", "43UJ", "Surrey Heath", "3640", "SURREY HEATH"),
    LocalAuthority("E09000029", "00BF", "Sutton", "5870", "SUTTON"),
    LocalAuthority("E07000113", "29UM", "Swale", "2255", "SWALE"),
    LocalAuthority("W06000011", "00NX", "Swansea", "6855", "SWANSEA"),
    LocalAuthority("E06000030", "00HX", "Swindon", "3935", "SWINDON"),
    LocalAuthority("E08000008", "00BT", "Tameside", "4240", "TAMESIDE"),
    LocalAuthority("E07000199", "41UK", "Tamworth", "3445", "TAMWORTH"),
    LocalAuthority("E07000215", "43UK", "Tandridge", "3645", "TANDRIDGE"),
    LocalAuthority("E07000190", "40UE", "Taunton Deane", "3315", "TAUNTON DEANE"),
    LocalAuthority("E07000045", "18UH", "Teignbridge", "1130", "TEIGNBRIDGE"),
    LocalAuthority("E06000020", "00GF", "Telford", "3240", "TELFORD"),
    LocalAuthority("E07000076", "22UN", "Tendring", "1560", "TENDRING"),
    LocalAuthority("E07000093", "24UN", "Test Valley", "1760", "TEST VALLEY"),
    LocalAuthority("E07000083", "23UG", "Tewkesbury", "1630", "TEWKESBURY"),
    LocalAuthority("E07000114", "29UN", "Thanet", "2260", "THANET"),
    LocalAuthority("E07000102", "26UJ", "Three Rivers", "1940", "THREE RIVERS"),
    LocalAuthority("E06000034", "00KG", "Thurrock", "1595", "THURROCK"),
    LocalAuthority("E07000115", "29UP", "Tonbridge and Malling", "2265", "TONBRIDGE AND MALLING"),
    LocalAuthority("E06000027", "00HH", "Torbay", "1165", "TORBAY"),
    LocalAuthority("W06000020", "00PM", "Torfaen", "6945", "TORFAEN"),
    LocalAuthority("E07000046", "18UK", "Torridge", "1145", "TORRIDGE"),
    LocalAuthority("E09000030", "00BG", "Tower Hamlets", "5900", "TOWER HAMLETS"),
    LocalAuthority("E08000009", "00BU", "Trafford", "4245", "TRAFFORD"),
    LocalAuthority("E07000116", "29UQ", "Tunbridge Wells", "2270", "TUNBRIDGE WELLS"),
    LocalAuthority("E07000077", "22UQ", "Uttlesford", "1570", "UTTLESFORD"),
    LocalAuthority("W06000014", "00PD", "Vale of Glamorgan", "6950", "VALE OF GLAMORGAN"),
    LocalAuthority("E07000180", "38UE", "Vale of White Horse", "3120", "VALE OF WHITE HORSE"),
    LocalAuthority("E08000036", "00DB", "Wakefield", "4725", "WAKEFIELD"),
    LocalAuthority("E08000030", "00CU", "Walsall", "4630", "WALSALL"),
    LocalAuthority("E09000031", "00BH", "Waltham Forest", "5930", "WALTHAM FOREST"),
    LocalAuthority("E09000032", "00BJ", "Wandsworth", "5960", "WANDSWORTH"),
    LocalAuthority("E06000007", "00EU", "Warrington", "655", "WARRINGTON"),
    LocalAuthority("E07000222", "44UF", "Warwick", "3725", "WARWICK"),
    LocalAuthority("E07000103", "26UK", "Watford", "1945", "WATFORD"),
    LocalAuthority("E07000206", "42UH", "Waveney", "3535", "WAVENEY"),
    LocalAuthority("E07000216", "43UL", "Waverley", "3650", "WAVERLEY"),
    LocalAuthority("E07000065", "21UH", "Wealden", "1435", "WEALDEN"),
    LocalAuthority("E07000156", "34UH", "Wellingborough", "2835", "WELLINGBOROUGH"),
    LocalAuthority("E07000241", "26UL", "Welwyn Hatfield", "1950", "WELWYN HATFIELD"),
    LocalAuthority("E06000037", "00MB", "West Berkshire", "340", "WEST BERKSHIRE"),
    LocalAuthority("E07000047", "18UL", "West Devon", "1150", "WEST DEVON"),
    LocalAuthority("E07000052", "19UH", "West Dorset", "1230", "WEST DORSET"),
    LocalAuthority("S12000039", "00QG", "West Dunbartonshire", "9057", "WEST DUNBARTONSHIRE"),
    LocalAuthority("E07000127", "30UP", "West Lancashire", "2365", "WEST LANCASHIRE"),
    LocalAuthority("E07000142", "32UH", "West Lindsey", "2535", "WEST LINDSEY"),
    LocalAuthority("S12000040", "00RH", "West Lothian", "9079", "WEST LOTHIAN"),
    LocalAuthority("E07000181", "38UF", "West Oxfordshire", "3125", "WEST OXFORDSHIRE"),
    LocalAuthority("E07000191", "40UF", "West Somerset", "3320", "WEST SOMERSET"),
    LocalAuthority("E09000033", "00BK", "Westminster", "5990", "WESTMINSTER"),
    LocalAuthority("E07000053", "19UJ", "Weymouth and Portland", "1235", "WEYMOUTH AND PORTLAND"),
    LocalAuthority("E08000010", "00BW", "Wigan", "4250", "WIGAN"),
    LocalAuthority("E06000054", "00HY", "Wiltshire", "3940", "WILTSHIRE"),
    LocalAuthority("E07000094", "24UP", "Winchester", "1765", "WINCHESTER"),
    LocalAuthority("E06000040", "00ME", "Windsor and Maidenhead", "355", "WINDSOR AND MAIDENHEAD"),
    LocalAuthority("E08000015", "00CB", "Wirral", "4325", "WIRRAL"),
    LocalAuthority("E07000217", "43UM", "Woking", "3655", "WOKING"),
    LocalAuthority("E06000041", "00MF", "Wokingham", "360", "WOKINGHAM"),
    LocalAuthority("E08000031", "00CW", "Wolverhampton", "4635", "WOLVERHAMPTON"),
    LocalAuthority("E07000237", "47UE", "Worcester", "1835", "WORCESTER"),
    LocalAuthority("E07000229", "45UH", "Worthing", "3835", "WORTHING"),
    LocalAuthority("W06000006", "00NL", "Wrexham", "6955", "WREXHAM"),
    LocalAuthority("E07000238", "47UF", "Wychavon", "1840", "WYCHAVON"),
    LocalAuthority("E07000007", "11UF", "Wycombe", "425", "WYCOMBE"),
    LocalAuthority("E07000128", "30UQ", "Wyre", "2370", "WYRE"),
    LocalAuthority("E07000239", "47UG", "Wyre Forest", "1845", "WYRE FOREST"),
    LocalAuthority("E06000014", "00FF", "York", "2741", "YORK")
  )
}
