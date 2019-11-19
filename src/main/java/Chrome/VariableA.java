package Chrome;

class VariableA {
    public StringBuffer getA(StringBuffer s) {

        StringBuffer a = new StringBuffer(
             "<ns1:Envelope xmlns:ns1=\"http://sbrf.ru/Pegas/LegalLoanDeal/PutLegalLoanDealElements/\" xmlns:tns=\"http://sbrf.ru/ESB/mq/headers\" xmlns:plldrq=\"http://sbrf.ru/Pegas/LegalLoanDeal/PutLegalLoanDealRq\" xmlns:ie=\"http://sbrf.ru/Pegas/LegalLoanDeal/IntegrationEntities\">\n" +
                "    <tns:Header>\n" +
                "        <tns:message-id>A56B7F2637F911e8995C00144FF994CB</tns:message-id>\n" +
                "        <tns:request-time>2018-04-04T12:00:01Z</tns:request-time>\n" +
                "        <tns:eis-name>urn:sbrfsystems:99-crmcorp</tns:eis-name>\n" +
                "        <tns:system-id>urn:sbrfsystems:99-apkkb</tns:system-id>\n" +
                "        <tns:operation-name>PutLegalLoanDealRq</tns:operation-name>\n" +
                "    </tns:Header>\n" +
                "    <ns1:Body>\n" +
                "        <plldrq:PutLegalLoanDealRq>\t\n" +
                "\t\t\n" +
                "\t\t<!--  В Н И М А Н И Е !  В А Ж Н О!  -->\n" +
                "\t\t<!-- Замени все \"oodefect\" на произвольное число/строку -->\n" +
                "\t\t<!-- Не делай это вручную, полюбому где-нибудь забудешь. Будь умным, используй Замену в текстовом редакторе -->\n" +
                "\t\t\n" +
                "            <plldrq:ExtId>Deal-oodefect</plldrq:ExtId>\n" +
                "            <plldrq:DealDate>2020-05-07T14:56:58Z</plldrq:DealDate>\n" +
                "            <plldrq:Description>Сделка тестовая</plldrq:Description>\n" +
                "\t\t\t<plldrq:SalesMethod>ED</plldrq:SalesMethod>\n" +
                "\t\t\t<plldrq:CategoryList>\n" +
                "                <ie:Category>\n" +
                "                    <ie:Id>Product limit KO</ie:Id>\n" +
                "                </ie:Category>\n" +
                "\t\t\t\t<ie:Category>\n" +
                "                    <ie:Id>Set limit KO</ie:Id>\n" +
                "                </ie:Category>\n" +
                "            </plldrq:CategoryList>\n" +
                "\t\t\t<plldrq:PrefixList>\n" +
                "                <ie:Prefix>\n" +
                "                    <ie:Id>MSP65</ie:Id>\n" +
                "                </ie:Prefix>\n" +
                "\t\t\t\t<ie:Prefix>\n" +
                "                    <ie:Id>Dynamic discounts</ie:Id>\n" +
                "                </ie:Prefix>\n" +
                "            </plldrq:PrefixList>\n" +
                "            <plldrq:DealTeamMemberList>\n" +
                "                <plldrq:DealTeamMember>\n" +
                "                    <ie:OperatorId>testcrmmanager1</ie:OperatorId>\n" +
                "                    <ie:RoleId>Primary KM</ie:RoleId>\n" +
                "                </plldrq:DealTeamMember>\n" +
                "            </plldrq:DealTeamMemberList>\n" +
                "            <plldrq:OrganizationList>\n" +
                "                <plldrq:Organization>\n" +
                "                    <plldrq:ExtId>Org1-oodefect</plldrq:ExtId>\n" +
                "                    <plldrq:MDMOrgId>975506597721035181</plldrq:MDMOrgId>\n" +
                "                    <plldrq:UCPOrgId>ID единого профиля</plldrq:UCPOrgId>\n" +
                "                    <plldrq:OPF>OOO</plldrq:OPF>\n" +
                "                    <plldrq:FullName>Незабудка Lmt.</plldrq:FullName>\n" +
                "                    <plldrq:ShortName>Незабудка</plldrq:ShortName>\n" +
                "                    <plldrq:RoleId>1</plldrq:RoleId>\n" +
                "                    <plldrq:OrganizationType>Account</plldrq:OrganizationType>\n" +
                "\t\t\t\t\t<plldrq:Category>Corp client</plldrq:Category>\n" +
                "                    <plldrq:CardOwnerLogin>TESTCRMMANAGER1</plldrq:CardOwnerLogin>\n" +
                "                    <plldrq:CardOwnerName>Шишкина Мария Евгеньевна</plldrq:CardOwnerName>\n" +
                "                    <plldrq:INN>2185769255</plldrq:INN>\n" +
                "                    <plldrq:KPP>218576925</plldrq:KPP>\n" +
                "\t\t\t\t\t<plldrq:KIO>1020304050</plldrq:KIO>\n" +
                "                    <plldrq:OGRN>4349225822832</plldrq:OGRN>\n" +
                "                    <plldrq:OKPO>06273165</plldrq:OKPO>\n" +
                "                    <plldrq:Industry>Mechanical engineering</plldrq:Industry>\n" +
                "                    <plldrq:MacroIndustry>5</plldrq:MacroIndustry>\n" +
                "                    <plldrq:SubIndustry>5.16.1</plldrq:SubIndustry>\n" +
                "                    <plldrq:KindOfActivity>21</plldrq:KindOfActivity>\n" +
                "                    <plldrq:Segment>Average 2</plldrq:Segment>\n" +
                "                    <plldrq:ClientFileId>{5FC73083-AA10-493C-AE91-241F84A56888}</plldrq:ClientFileId>\n" +
                "                    <plldrq:Residency>Resident</plldrq:Residency>\n" +
                "                    <plldrq:KKFZ>true</plldrq:KKFZ>\n" +
                "                    <plldrq:NewLimitStructure>true</plldrq:NewLimitStructure>\n" +
                "                    <plldrq:GRBInfo>\n" +
                "                        <plldrq:ExtId>GRB1-oodefect</plldrq:ExtId>\n" +
                "                        <plldrq:Name>ГКП_ГСЗ1</plldrq:Name>\n" +
                "                        <plldrq:HighLevelGRBId>OComp2-oodefect</plldrq:HighLevelGRBId>\n" +
                "                        <plldrq:HighLevelGRBName>Вторая для верхнеуровневой</plldrq:HighLevelGRBName>\n" +
                "                        <plldrq:MainManagerLogin>TESTCRMKM4</plldrq:MainManagerLogin>\n" +
                "                        <plldrq:MainManagerName>TESTCRMKM4 TESTCRMKM4 undefined</plldrq:MainManagerName>\n" +
                "                    </plldrq:GRBInfo>\n" +
                "                    <plldrq:EKInfo>\n" +
                "                        <plldrq:ExtId>EK1-oodefect</plldrq:ExtId>\n" +
                "                        <plldrq:MDMId>764550659791642609</plldrq:MDMId>\n" +
                "                        <plldrq:Name>OBSCHESTVO S OGRANICHENNOY OTVETSTVENNOST&apos;YU GKP_1.3+23</plldrq:Name>\n" +
                "                        <plldrq:MainManagerLogin>TESTCRMKM4</plldrq:MainManagerLogin>\n" +
                "                        <plldrq:MainManagerName>TESTCRMKM4 TESTCRMKM4 undefined</plldrq:MainManagerName>\n" +
                "                    </plldrq:EKInfo>\n" +
                "                    <plldrq:MGInfo>\n" +
                "                        <plldrq:ExtId>MG1-oodefect</plldrq:ExtId>\n" +
                "                        <plldrq:MDMId>832052207612692197</plldrq:MDMId>\n" +
                "                        <plldrq:Name>ГКП_ГСЗ1</plldrq:Name>\n" +
                "                    </plldrq:MGInfo>\n" +
                "                    <plldrq:ProblemGroupInfo>\n" +
                "                        <plldrq:CalculatedProblemGroup>Yellow Zone</plldrq:CalculatedProblemGroup>\n" +
                "                        <plldrq:ApprovedProblemGroup>Yellow Zone</plldrq:ApprovedProblemGroup>\n" +
                "                    </plldrq:ProblemGroupInfo>\n" +
                "\t\t\t\t\t<plldrq:BranchList>\n" +
                "                        <plldrq:BranchInfo>\n" +
                "                            <plldrq:OrganizationId>Org1-oodefect</plldrq:OrganizationId>\n" +
                "                            <plldrq:BranchId>BrId01-oodefect</plldrq:BranchId>\n" +
                "                            <plldrq:AddDate>2007-07-07T07:07:07.0</plldrq:AddDate>\n" +
                "                            <plldrq:MainBranch>Mechanical engineering</plldrq:MainBranch>\n" +
                "                            <plldrq:ParticipantBusiness>Производство машин и оборудования</plldrq:ParticipantBusiness>\n" +
                "                            <plldrq:MarketTrend>Тенденция на рынках падает</plldrq:MarketTrend>\n" +
                "                            <plldrq:PrimaryActivity>Продажа автомобилей</plldrq:PrimaryActivity>\n" +
                "                            <plldrq:DemandDynamic>Down</plldrq:DemandDynamic>\n" +
                "                            <plldrq:MarketList>\n" +
                "                                <plldrq:Market>\n" +
                "                                    <plldrq:Id>1-IHCPEOK</plldrq:Id>\n" +
                "                                    <plldrq:Name>Оптовая продажа авто</plldrq:Name>\n" +
                "                                    <plldrq:Share>5</plldrq:Share>\n" +
                "                                    <plldrq:Description>Оптовая продажа отечественных авто</plldrq:Description>\n" +
                "                                    <plldrq:Benefits>Высокий спрос</plldrq:Benefits>\n" +
                "                                    <plldrq:Drawbacks>Сезонность</plldrq:Drawbacks>\n" +
                "                                    <plldrq:ClientCompetitorList>\n" +
                "                                        <plldrq:ClientCompetitor>\n" +
                "                                            <plldrq:ExtId>ClComp1-oodefect</plldrq:ExtId>\n" +
                "                                            <plldrq:Name>КПФ ЛУЧ</plldrq:Name>\n" +
                "                                            <plldrq:Benefits>Высокий спрос</plldrq:Benefits>\n" +
                "                                            <plldrq:Drawbacks>Ограниченная зона доставки</plldrq:Drawbacks>\n" +
                "                                        </plldrq:ClientCompetitor>\n" +
                "                                    </plldrq:ClientCompetitorList>\n" +
                "                                    <plldrq:NonClientCompetitorList>\n" +
                "                                        <plldrq:NonClientCompetitor>\n" +
                "                                            <plldrq:Name>ОАО \"МашинКо\"</plldrq:Name>\n" +
                "                                            <plldrq:Benefits>Распространенная сеть</plldrq:Benefits>\n" +
                "                                            <plldrq:Drawbacks>Небольшой выбор</plldrq:Drawbacks>\n" +
                "                                        </plldrq:NonClientCompetitor>\n" +
                "                                    </plldrq:NonClientCompetitorList>\n" +
                "                                    <plldrq:CGCompetitorList>\n" +
                "                                        <plldrq:OtherCompetitor>\n" +
                "                                            <plldrq:ExtId>OComp1-oodefect</plldrq:ExtId>\n" +
                "                                            <plldrq:Name>Консолидированная группа_12</plldrq:Name>\n" +
                "                                            <plldrq:Benefits>Высокий спрос</plldrq:Benefits>\n" +
                "                                            <plldrq:Drawbacks>Долгая доставка</plldrq:Drawbacks>\n" +
                "                                        </plldrq:OtherCompetitor>\n" +
                "                                    </plldrq:CGCompetitorList>\n" +
                "                                    <plldrq:GRBCompetitorList>\n" +
                "                                        <plldrq:OtherCompetitor>\n" +
                "                                            <plldrq:ExtId>OComp2-oodefect</plldrq:ExtId>\n" +
                "                                            <plldrq:Name>Вторая для верхнеуровневой</plldrq:Name>\n" +
                "                                            <plldrq:Benefits>Высокий спрос</plldrq:Benefits>\n" +
                "                                            <plldrq:Drawbacks>Компания скоро закрывается</plldrq:Drawbacks>\n" +
                "                                        </plldrq:OtherCompetitor>\n" +
                "                                    </plldrq:GRBCompetitorList>\n" +
                "                                </plldrq:Market>\n" +
                "                            </plldrq:MarketList>\n" +
                "                        </plldrq:BranchInfo>\n" +
                "                        <plldrq:BranchInfo>\n" +
                "                            <!-- Для Заещика, указан ID Заемщика -->\n" +
                "                            <plldrq:OrganizationId>Org1-oodefect</plldrq:OrganizationId>\n" +
                "                            <plldrq:BranchId>BrId02-oodefect</plldrq:BranchId>\n" +
                "                            <plldrq:AddDate>2007-07-07T07:07:07.0</plldrq:AddDate>\n" +
                "                            <plldrq:MainBranch>Health and Education</plldrq:MainBranch>\n" +
                "                            <plldrq:ParticipantBusiness>Бизнес ЮЛ - Здравоохранение, образование</plldrq:ParticipantBusiness>\n" +
                "                            <plldrq:MarketTrend>Тенденция на рынках растет</plldrq:MarketTrend>\n" +
                "                            <plldrq:PrimaryActivity>Основная деятельность ЮЛ в отрасли - здравоохранение</plldrq:PrimaryActivity>\n" +
                "                            <plldrq:DemandDynamic>Rise</plldrq:DemandDynamic>\n" +
                "                            <plldrq:MarketList>\n" +
                "                                <plldrq:Market>\n" +
                "                                    <plldrq:Id>Market-3</plldrq:Id>\n" +
                "                                    <plldrq:Name>Оптовая продажа лекарств</plldrq:Name>\n" +
                "                                    <plldrq:Share>15%</plldrq:Share>\n" +
                "                                    <plldrq:Description>Бизнес по переработке трав является высоко рентабельным, ввиду малых затрат на оборудование и постоянного спроса на этот вид товаров. Популярность лекарственных трав продиктована низкой ценой, безопасностью и т.д.</plldrq:Description>\n" +
                "                                    <plldrq:Benefits>Большая площадь взращивания растений</plldrq:Benefits>\n" +
                "                                    <plldrq:Drawbacks>Недостаток ресурсов, малое количество точек сбыта</plldrq:Drawbacks>\n" +
                "                                    <plldrq:ClientCompetitorList>\n" +
                "                                        <plldrq:ClientCompetitor>\n" +
                "                                            <plldrq:ExtId>ClComp2-oodefect</plldrq:ExtId>\n" +
                "                                            <plldrq:Name>ИП \"Мария Ивановна\"</plldrq:Name>\n" +
                "                                            <plldrq:Benefits>Использование активной рекламной компании</plldrq:Benefits>\n" +
                "                                            <plldrq:Drawbacks>Только наличная оплата</plldrq:Drawbacks>\n" +
                "                                        </plldrq:ClientCompetitor>\n" +
                "                                        <plldrq:ClientCompetitor>\n" +
                "                                            <plldrq:ExtId>ClComp3-oodefect</plldrq:ExtId>\n" +
                "                                            <plldrq:Name>ООО \"Травы бати\"</plldrq:Name>\n" +
                "                                            <plldrq:Benefits>Использование активной рекламной компании, привлечение молодежи</plldrq:Benefits>\n" +
                "                                            <plldrq:Drawbacks>Не конкурентоспособные цены</plldrq:Drawbacks>\n" +
                "                                        </plldrq:ClientCompetitor>\n" +
                "                                    </plldrq:ClientCompetitorList>\n" +
                "                                    <plldrq:CGCompetitorList>\n" +
                "                                        <plldrq:OtherCompetitor>\n" +
                "                                            <plldrq:ExtId>OComp3-oodefect</plldrq:ExtId>\n" +
                "                                            <plldrq:Name>КГ \"Маленькая Голландия\"</plldrq:Name>\n" +
                "                                            <plldrq:Benefits>Большой выбор тюльпанов</plldrq:Benefits>\n" +
                "                                            <plldrq:Drawbacks>Маленькое разнообразие цветов</plldrq:Drawbacks>\n" +
                "                                        </plldrq:OtherCompetitor>\n" +
                "                                    </plldrq:CGCompetitorList>\n" +
                "                                </plldrq:Market>\n" +
                "                            </plldrq:MarketList>\n" +
                "                        </plldrq:BranchInfo>\n" +
                "                    </plldrq:BranchList>\n" +
                "                    <plldrq:RiskSegmentInfo>\n" +
                "                        <plldrq:RiskSegment>Микрофин организация</plldrq:RiskSegment>\n" +
                "                        <plldrq:ApprovalDate>2017-12-07T13:59:21Z</plldrq:ApprovalDate>\n" +
                "                        <plldrq:Comment>Изменено в ручном режиме в CRM. Подробная информация отражена на вкладке История изменений. Автоматическое обновление из BPM в рамках сделки 1-HN6WWPF. Автоматическое обновление из BPM в рамках сделки 1-HO7BFHV. Автоматическое обновление из BPM в рамках с. Автоматическое обновление из BPM в рамках сделки 1-I0PZ9E9</plldrq:Comment>\n" +
                "                    </plldrq:RiskSegmentInfo>\n" +
                "                    <plldrq:RatingList>\n" +
                "                        <plldrq:Rating>\n" +
                "                            <plldrq:Id>Rating1-oodefect</plldrq:Id>\n" +
                "                            <plldrq:Type>Rating</plldrq:Type>\n" +
                "                            <plldrq:Status>Determination of Anderrajtera</plldrq:Status>\n" +
                "                            <plldrq:Value>26</plldrq:Value>\n" +
                "                            <plldrq:Model>CC_RAS</plldrq:Model>\n" +
                "                            <plldrq:AddDate>2017-11-30</plldrq:AddDate>\n" +
                "                            <plldrq:EmployeeLogin>TESTCRMBABDAPLANDIA</plldrq:EmployeeLogin>\n" +
                "                            <plldrq:EmployeeName>Testcrmbabdaplandia Testcrmbabdaplandia Testcrmbabdaplandia</plldrq:EmployeeName>\n" +
                "                            <plldrq:TermDate>2017-12-01</plldrq:TermDate>\n" +
                "                            <plldrq:CalculatedRatingList>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Analyst</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMBABDAPLANDIA</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Testcrmbabdaplandia Testcrmbabdaplandia Testcrmbabdaplandia</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-11-30</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-11-30T12:52:57Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>26</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>26</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                            </plldrq:CalculatedRatingList>\n" +
                "                        </plldrq:Rating>\n" +
                "                        <plldrq:Rating>\n" +
                "                            <plldrq:Id>Rating2-oodefect</plldrq:Id>\n" +
                "                            <plldrq:Type>Rating</plldrq:Type>\n" +
                "                            <plldrq:Status>Actual</plldrq:Status>\n" +
                "                            <plldrq:Value>5</plldrq:Value>\n" +
                "                            <plldrq:Model>CC_RAS</plldrq:Model>\n" +
                "                            <plldrq:AddDate>2017-09-28</plldrq:AddDate>\n" +
                "                            <plldrq:ApprovalDate>2017-09-28T15:53:36Z</plldrq:ApprovalDate>\n" +
                "                            <plldrq:EmployeeLogin>TESTCRMBABDAPLANDIA</plldrq:EmployeeLogin>\n" +
                "                            <plldrq:EmployeeName>Testcrmbabdaplandia Testcrmbabdaplandia Testcrmbabdaplandia</plldrq:EmployeeName>\n" +
                "                            <plldrq:TermDate>2017-09-29</plldrq:TermDate>\n" +
                "                            <plldrq:PD>0.097</plldrq:PD>\n" +
                "                            <plldrq:CalculatedRatingList>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Underwriter</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMRISKMANAGER1_TB1</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Testcrmriskmanager1_Tb1 Testcrmriskmanager1_Tb1 Testcrmriskmanager1_Tb1</plldrq:OperatorName>\n" +
                "                                    <plldrq:UpdateDate>2017-09-28T15:53:23Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>5</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>17</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>5</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Analyst</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMBABDAPLANDIA</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Testcrmbabdaplandia Testcrmbabdaplandia Testcrmbabdaplandia</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-09-28</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-09-28T15:53:01Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>5</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>17</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>5</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                            </plldrq:CalculatedRatingList>\n" +
                "                        </plldrq:Rating>\n" +
                "                        <plldrq:Rating>\n" +
                "                            <plldrq:Id>Rating3-oodefect</plldrq:Id>\n" +
                "                            <plldrq:Type>Rating</plldrq:Type>\n" +
                "                            <plldrq:Status>Calculate Anderrajter</plldrq:Status>\n" +
                "                            <plldrq:Value>9</plldrq:Value>\n" +
                "                            <plldrq:Model>CC_RAS</plldrq:Model>\n" +
                "                            <plldrq:AddDate>2017-12-04</plldrq:AddDate>\n" +
                "                            <plldrq:EmployeeLogin>TESTCRMBABDAPLANDIA</plldrq:EmployeeLogin>\n" +
                "                            <plldrq:EmployeeName>Testcrmbabdaplandia Testcrmbabdaplandia Testcrmbabdaplandia</plldrq:EmployeeName>\n" +
                "                            <plldrq:TermDate>2017-12-05</plldrq:TermDate>\n" +
                "                            <plldrq:CalculatedRatingList>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Analyst</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMBABDAPLANDIA</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Testcrmbabdaplandia Testcrmbabdaplandia Testcrmbabdaplandia</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-04T14:08:34Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>17</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Underwriter</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMRISKMANAGER1_TB1</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Testcrmriskmanager1_Tb1 Testcrmriskmanager1_Tb1 Testcrmriskmanager1_Tb1</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-04T14:09:44Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>17</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                            </plldrq:CalculatedRatingList>\n" +
                "                        </plldrq:Rating>\n" +
                "                        <plldrq:Rating>\n" +
                "                            <plldrq:Id>Rating4-oodefect</plldrq:Id>\n" +
                "                            <plldrq:Type>Rating</plldrq:Type>\n" +
                "                            <plldrq:Status>Finish</plldrq:Status>\n" +
                "                            <plldrq:Value>5</plldrq:Value>\n" +
                "                            <plldrq:Model>CC_RAS</plldrq:Model>\n" +
                "                            <plldrq:AddDate>2017-12-04</plldrq:AddDate>\n" +
                "                            <plldrq:EmployeeLogin>TESTBPMAR1_TB4</plldrq:EmployeeLogin>\n" +
                "                            <plldrq:EmployeeName>Testbpmar1_Tb4 Testbpmar1_Tb4 Testbpmar1_Tb4</plldrq:EmployeeName>\n" +
                "                            <plldrq:CalculatedRatingList>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Underwriter</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTBPMAR1_TB4</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Testbpmar1_Tb4 Testbpmar1_Tb4 Testbpmar1_Tb4</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-04T12:15:12Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>5</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>17</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>5</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Analyst</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMKP4</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>TESTCRMKP4 TESTCRMKP4 undefined</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-04T10:52:33Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>5</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>17</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>5</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                            </plldrq:CalculatedRatingList>\n" +
                "                        </plldrq:Rating>\n" +
                "                    </plldrq:RatingList>\n" +
                "                    <plldrq:MarkerInfo>\n" +
                "                        <plldrq:MarkerId>RMK1-oodefect</plldrq:MarkerId>\n" +
                "                        <plldrq:DebtCapacityMarker>899998.3</plldrq:DebtCapacityMarker>\n" +
                "                        <plldrq:DebtCapacity>899998.3</plldrq:DebtCapacity>\n" +
                "                        <plldrq:RatingId>Rating2-oodefect</plldrq:RatingId>\n" +
                "                        <plldrq:ReportingType>РСБУ</plldrq:ReportingType>\n" +
                "                        <plldrq:Status>Actual</plldrq:Status>\n" +
                "                        <plldrq:AppovalDate>2018-03-12T12:32:48Z</plldrq:AppovalDate>\n" +
                "                        <plldrq:ApprovalEmployeeLogin>SADMIN</plldrq:ApprovalEmployeeLogin>\n" +
                "                        <plldrq:ApprovalEmployeeName>Иванов_3 Иван_3 Иванович_3</plldrq:ApprovalEmployeeName>\n" +
                "                    </plldrq:MarkerInfo>\n" +
                "                    <plldrq:StopFactorList>\n" +
                "                        <plldrq:StopFactor>\n" +
                "                            <plldrq:Name>Просроченная задолженность перед Банком</plldrq:Name>\n" +
                "                            <plldrq:Comment>Задолжность составляет 1 млн рублей</plldrq:Comment>\n" +
                "                        </plldrq:StopFactor>\n" +
                "                    </plldrq:StopFactorList>\n" +
                "                    <plldrq:RegistrationInfo>\n" +
                "                        <plldrq:RegistrationDate>2017-09-28</plldrq:RegistrationDate>\n" +
                "                        <plldrq:Authority>123</plldrq:Authority>\n" +
                "                        <plldrq:SertificateSeries>123</plldrq:SertificateSeries>\n" +
                "                        <plldrq:IssueDate>2017-09-28</plldrq:IssueDate>\n" +
                "                    </plldrq:RegistrationInfo>\n" +
                "                    <plldrq:AddressList>\n" +
                "                        <plldrq:Address>\n" +
                "                            <plldrq:Type>Actual Address</plldrq:Type>\n" +
                "                            <plldrq:IsPrimary>true</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                            <plldrq:Country>Russian Federation</plldrq:Country>\n" +
                "                            <plldrq:City>123</plldrq:City>\n" +
                "                            <plldrq:Street>123</plldrq:Street>\n" +
                "                            <plldrq:House>123</plldrq:House>\n" +
                "                            <plldrq:PostIndex>321456</plldrq:PostIndex>\n" +
                "                        </plldrq:Address>\n" +
                "                        <plldrq:Address>\n" +
                "                            <plldrq:Type>Legal Address</plldrq:Type>\n" +
                "                            <plldrq:IsPrimary>false</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                            <plldrq:Country>Russian Federation</plldrq:Country>\n" +
                "                            <plldrq:City>132</plldrq:City>\n" +
                "                            <plldrq:Street>312</plldrq:Street>\n" +
                "                            <plldrq:House>123</plldrq:House>\n" +
                "                            <plldrq:PostIndex>321123</plldrq:PostIndex>\n" +
                "                        </plldrq:Address>\n" +
                "                        <plldrq:Address>\n" +
                "                            <plldrq:Type>Home</plldrq:Type>\n" +
                "                            <plldrq:IsPrimary>false</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                            <plldrq:Country>Russian Federation</plldrq:Country>\n" +
                "                            <plldrq:City>32</plldrq:City>\n" +
                "                            <plldrq:Street>32</plldrq:Street>\n" +
                "                            <plldrq:House>23</plldrq:House>\n" +
                "                            <plldrq:PostIndex>122332</plldrq:PostIndex>\n" +
                "                        </plldrq:Address>\n" +
                "                    </plldrq:AddressList>\n" +
                "                    <plldrq:PhoneList>\n" +
                "                        <plldrq:Phone>\n" +
                "                            <plldrq:Type>Cell</plldrq:Type>\n" +
                "                            <plldrq:Number>+7 (915) 6345645</plldrq:Number>\n" +
                "                            <plldrq:IsPrimary>false</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                            <plldrq:IsForSMS>true</plldrq:IsForSMS>\n" +
                "                        </plldrq:Phone>\n" +
                "                    </plldrq:PhoneList>\n" +
                "                    <plldrq:EmailAddressList>\n" +
                "                        <plldrq:Email>\n" +
                "                            <plldrq:Type>Business</plldrq:Type>\n" +
                "                            <plldrq:Address>ert@wer.rt</plldrq:Address>\n" +
                "                            <plldrq:IsPrimary>true</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                        </plldrq:Email>\n" +
                "                    </plldrq:EmailAddressList>\n" +
                "                </plldrq:Organization>\n" +
                "                <plldrq:Organization>\n" +
                "                    <plldrq:ExtId>Org2-oodefect</plldrq:ExtId>\n" +
                "                    <plldrq:MDMOrgId>725650659740402008</plldrq:MDMOrgId>\n" +
                "                    <plldrq:OPF>OOO</plldrq:OPF>\n" +
                "                    <plldrq:FullName>Василёк Синий</plldrq:FullName>\n" +
                "                    <plldrq:ShortName>Василёк</plldrq:ShortName>\n" +
                "                    <plldrq:OrganizationType>Account</plldrq:OrganizationType>\n" +
                "\t\t\t\t\t<plldrq:Category>Corp client</plldrq:Category>\n" +
                "                    <plldrq:CardOwnerLogin>TESTCRMMANAGER1</plldrq:CardOwnerLogin>\n" +
                "                    <plldrq:CardOwnerName>Шишкина Мария Евгеньевна</plldrq:CardOwnerName>\n" +
                "                    <plldrq:INN>3879935991</plldrq:INN>\n" +
                "                    <plldrq:KPP>387993599</plldrq:KPP>\n" +
                "                    <plldrq:OGRN>7401729198446</plldrq:OGRN>\n" +
                "                    <plldrq:OKPO>32415678</plldrq:OKPO>\n" +
                "                    <plldrq:Industry>Oil and Gas</plldrq:Industry>\n" +
                "\t\t\t\t\t<plldrq:MacroIndustry>6</plldrq:MacroIndustry>\n" +
                "                    <plldrq:SubIndustry>6.18.2</plldrq:SubIndustry>\n" +
                "                    <plldrq:KindOfActivity>Производство  нефтепродуктов</plldrq:KindOfActivity>\n" +
                "                    <plldrq:Segment>Large</plldrq:Segment>\n" +
                "                    <plldrq:ClientFileId>{61A92BEC-7BC2-433B-A67A-B39FFA4104FE}</plldrq:ClientFileId>\n" +
                "                    <plldrq:Residency>Resident</plldrq:Residency>\n" +
                "                    <plldrq:KKFZ>true</plldrq:KKFZ>\n" +
                "                    <plldrq:CGId>CG1-oodefect</plldrq:CGId>\n" +
                "                    <plldrq:NewLimitStructure>true</plldrq:NewLimitStructure>\n" +
                "                    <plldrq:EKInfo>\n" +
                "                        <plldrq:ExtId>EK2-oodefect</plldrq:ExtId>\n" +
                "                        <plldrq:MDMId>510150659757107022</plldrq:MDMId>\n" +
                "                        <plldrq:Name>OTKRYTOE AKTSIONERNOE OBSCHESTVO ORGANIZATSIYA UDACHI</plldrq:Name>\n" +
                "                        <plldrq:MainManagerLogin>TESTCRMKM4</plldrq:MainManagerLogin>\n" +
                "                        <plldrq:MainManagerName>TESTCRMKM4 TESTCRMKM4 undefined</plldrq:MainManagerName>\n" +
                "                    </plldrq:EKInfo>\n" +
                "                    <plldrq:RiskSegmentInfo>\n" +
                "                        <plldrq:RiskSegment>Корпор. компания-резидент (РФ)</plldrq:RiskSegment>\n" +
                "                        <plldrq:ApprovalDate>2017-09-28T14:18:01Z</plldrq:ApprovalDate>\n" +
                "                        <plldrq:Comment>Изменено в ручном режиме в CRM. Подробная информация отражена на вкладке История изменений. Автоматическое обновление из BPM в рамках сделки 1-HMRYBFX</plldrq:Comment>\n" +
                "                    </plldrq:RiskSegmentInfo>\n" +
                "                    <plldrq:RatingList>\n" +
                "                        <plldrq:Rating>\n" +
                "                            <plldrq:Id>Rating5-oodefect</plldrq:Id>\n" +
                "                            <plldrq:Type>Rating</plldrq:Type>\n" +
                "                            <plldrq:Status>Actual</plldrq:Status>\n" +
                "                            <plldrq:Value>9</plldrq:Value>\n" +
                "                            <plldrq:Model>CC_RAS</plldrq:Model>\n" +
                "                            <plldrq:AddDate>2017-09-28</plldrq:AddDate>\n" +
                "                            <plldrq:ApprovalDate>2017-09-28T15:48:55Z</plldrq:ApprovalDate>\n" +
                "                            <plldrq:EmployeeLogin>TESTCRMRISKMANAGER1</plldrq:EmployeeLogin>\n" +
                "                            <plldrq:EmployeeName>Testcrmriskmanager1 Testcrmriskmanager1 Testcrmriskmanager1</plldrq:EmployeeName>\n" +
                "                            <plldrq:TermDate>2017-09-29</plldrq:TermDate>\n" +
                "                            <plldrq:PD>0.348</plldrq:PD>\n" +
                "                            <plldrq:CalculatedRatingList>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Analyst</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMBABDAPLANDIA</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Testcrmbabdaplandia Testcrmbabdaplandia Testcrmbabdaplandia</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-09-28</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-09-28T15:45:39Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>11</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Underwriter</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMRISKMANAGER1</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Testcrmriskmanager1 Testcrmriskmanager1 Testcrmriskmanager1</plldrq:OperatorName>\n" +
                "                                    <plldrq:UpdateDate>2017-09-28T15:48:24Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>11</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                            </plldrq:CalculatedRatingList>\n" +
                "                        </plldrq:Rating>\n" +
                "                    </plldrq:RatingList>\n" +
                "                    <plldrq:StopFactorList>\n" +
                "                        <plldrq:StopFactor>\n" +
                "                            <plldrq:Name>Судебный процесс в отношении заемщика</plldrq:Name>\n" +
                "                            <plldrq:Comment>Комментарий по судебному процессу</plldrq:Comment>\n" +
                "                        </plldrq:StopFactor>\n" +
                "                    </plldrq:StopFactorList>\n" +
                "                    <plldrq:RegistrationInfo>\n" +
                "                        <plldrq:RegistrationDate>2017-09-13</plldrq:RegistrationDate>\n" +
                "                        <plldrq:Authority>Орган регистрации</plldrq:Authority>\n" +
                "                        <plldrq:SertificateSeries>435253</plldrq:SertificateSeries>\n" +
                "                        <plldrq:IssueDate>2017-09-28</plldrq:IssueDate>\n" +
                "                    </plldrq:RegistrationInfo>\n" +
                "                    <plldrq:AddressList>\n" +
                "                        <plldrq:Address>\n" +
                "                            <plldrq:Type>Actual Address</plldrq:Type>\n" +
                "                            <plldrq:IsPrimary>true</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                            <plldrq:Country>Russian Federation</plldrq:Country>\n" +
                "                            <plldrq:City>Москва</plldrq:City>\n" +
                "                            <plldrq:Street>ул. Усиевича</plldrq:Street>\n" +
                "                            <plldrq:House>32</plldrq:House>\n" +
                "                            <plldrq:PostIndex>546363</plldrq:PostIndex>\n" +
                "                        </plldrq:Address>\n" +
                "                    </plldrq:AddressList>\n" +
                "                    <plldrq:PhoneList>\n" +
                "                        <plldrq:Phone>\n" +
                "                            <plldrq:Type>Business</plldrq:Type>\n" +
                "                            <plldrq:Number>+7 (955) 9483943</plldrq:Number>\n" +
                "                            <plldrq:IsPrimary>false</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                            <plldrq:IsForSMS>false</plldrq:IsForSMS>\n" +
                "                        </plldrq:Phone>\n" +
                "                    </plldrq:PhoneList>\n" +
                "                    <plldrq:EmailAddressList>\n" +
                "                        <plldrq:Email>\n" +
                "                            <plldrq:Type>Documents Email</plldrq:Type>\n" +
                "                            <plldrq:Address>wer@w.ru</plldrq:Address>\n" +
                "                            <plldrq:IsPrimary>true</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                        </plldrq:Email>\n" +
                "                    </plldrq:EmailAddressList>\n" +
                "                </plldrq:Organization>\n" +
                "                <plldrq:Organization>\n" +
                "                    <plldrq:ExtId>Org3-oodefect</plldrq:ExtId>\n" +
                "                    <plldrq:MDMOrgId>692850659772512327</plldrq:MDMOrgId>\n" +
                "                    <plldrq:UCPOrgId>ID единого профиля</plldrq:UCPOrgId>\n" +
                "                    <plldrq:OPF>OOO</plldrq:OPF>\n" +
                "                    <plldrq:FullName>Ромашка Ромашка</plldrq:FullName>\n" +
                "                    <plldrq:ShortName>Ромашка</plldrq:ShortName>\n" +
                "                    <plldrq:OrganizationType>Account</plldrq:OrganizationType>\n" +
                "\t\t\t\t\t<plldrq:Category>Corp client</plldrq:Category>\n" +
                "                    <plldrq:CardOwnerLogin>TESTCRMMANAGER1</plldrq:CardOwnerLogin>\n" +
                "                    <plldrq:CardOwnerName>Шишкина Мария Евгеньевна</plldrq:CardOwnerName>\n" +
                "                    <plldrq:INN>0610931480</plldrq:INN>\n" +
                "                    <plldrq:KPP>343034448</plldrq:KPP>\n" +
                "                    <plldrq:OGRN>9816865278440</plldrq:OGRN>\n" +
                "                    <plldrq:OKPO>16225882</plldrq:OKPO>\n" +
                "                    <plldrq:Industry>Mechanical engineering</plldrq:Industry>\n" +
                "                    <plldrq:MacroIndustry>5</plldrq:MacroIndustry>\n" +
                "                    <plldrq:SubIndustry>5.16.2</plldrq:SubIndustry>\n" +
                "                    <plldrq:KindOfActivity>Производство машин и оборудования</plldrq:KindOfActivity>\n" +
                "                    <plldrq:Segment>Large</plldrq:Segment>\n" +
                "                    <plldrq:ClientFileId>{B1F7C541-20BF-4C62-925A-ACBAE7B96BC1}</plldrq:ClientFileId>\n" +
                "                    <plldrq:Residency>Working Nonresident</plldrq:Residency>\n" +
                "                    <plldrq:KKFZ>true</plldrq:KKFZ>\n" +
                "                    <plldrq:CGId>CG1-oodefect</plldrq:CGId>\n" +
                "                    <plldrq:NewLimitStructure>true</plldrq:NewLimitStructure>\n" +
                "                    <plldrq:GRBInfo>\n" +
                "                        <plldrq:ExtId>GRB2-oodefect</plldrq:ExtId>\n" +
                "                        <plldrq:Name>ГСЗ Красивая</plldrq:Name>\n" +
                "                        <plldrq:HighLevelGRBId>32323</plldrq:HighLevelGRBId>\n" +
                "                        <plldrq:HighLevelGRBName>ГСЗ Очень красивая</plldrq:HighLevelGRBName>\n" +
                "                        <plldrq:MainManagerLogin>MMLoginchic</plldrq:MainManagerLogin>\n" +
                "                        <plldrq:MainManagerName>Иванов Иван Иванович</plldrq:MainManagerName>\n" +
                "                    </plldrq:GRBInfo>\n" +
                "                    <plldrq:EKInfo>\n" +
                "                        <plldrq:ExtId>EK3-oodefect</plldrq:ExtId>\n" +
                "                        <plldrq:MDMId>797950659791177957</plldrq:MDMId>\n" +
                "                        <plldrq:Name>Единый клиент Одуванчик</plldrq:Name>\n" +
                "                        <plldrq:MainManagerLogin>TESTCRMKM4</plldrq:MainManagerLogin>\n" +
                "                        <plldrq:MainManagerName>Менеджеровенко ЕК</plldrq:MainManagerName>\n" +
                "                    </plldrq:EKInfo>\n" +
                "                    <plldrq:MGInfo>\n" +
                "                        <plldrq:ExtId>MG2-oodefect</plldrq:ExtId>\n" +
                "                        <plldrq:MDMId>141522076126949189</plldrq:MDMId>\n" +
                "                        <plldrq:Name>ОАО СветлогорскХимВолокно</plldrq:Name>\n" +
                "                    </plldrq:MGInfo>\n" +
                "                    <plldrq:ProblemGroupInfo>\n" +
                "                        <plldrq:CalculatedProblemGroup>Yellow Zone</plldrq:CalculatedProblemGroup>\n" +
                "                        <plldrq:ApprovedProblemGroup>Green Zone</plldrq:ApprovedProblemGroup>\n" +
                "                        <plldrq:ProblemCriterionList>\n" +
                "                            <plldrq:ProblemCriterion>\n" +
                "                                <plldrq:Number>1</plldrq:Number>\n" +
                "                                <plldrq:Name>Обычный критерий проблемности</plldrq:Name>\n" +
                "                                <plldrq:Status>Actual</plldrq:Status>\n" +
                "                                <plldrq:AddDate>2017-02-14T09:54:48Z</plldrq:AddDate>\n" +
                "                                <plldrq:AddEmployee>Мартынюк Олег Олегович</plldrq:AddEmployee>\n" +
                "                                <plldrq:StartDate>2018-03-26T00:00:00Z</plldrq:StartDate>\n" +
                "                                <plldrq:EndDate>2020-03-26T00:00:00Z</plldrq:EndDate>\n" +
                "                            </plldrq:ProblemCriterion>\n" +
                "                            <plldrq:ProblemCriterion>\n" +
                "                                <plldrq:Number>1.1</plldrq:Number>\n" +
                "                                <plldrq:Name>Сложный критерий проблемности</plldrq:Name>\n" +
                "                                <plldrq:Status>Added</plldrq:Status>\n" +
                "                                <plldrq:AddDate>2018-11-26T11:11:48Z</plldrq:AddDate>\n" +
                "                                <plldrq:AddEmployee>Мартынюк Олег Олегович</plldrq:AddEmployee>\n" +
                "                                <plldrq:StartDate>2018-03-26T00:00:00Z</plldrq:StartDate>\n" +
                "                                <plldrq:EndDate>2020-03-26T00:00:00Z</plldrq:EndDate>\n" +
                "                            </plldrq:ProblemCriterion>\n" +
                "                            <plldrq:ProblemCriterion>\n" +
                "                                <plldrq:Number>1.2</plldrq:Number>\n" +
                "                                <plldrq:Name>Нарушение показателя</plldrq:Name>\n" +
                "                                <plldrq:Status>Actual</plldrq:Status>\n" +
                "                                <plldrq:AddDate>2010-03-26T15:22:48Z</plldrq:AddDate>\n" +
                "                                <plldrq:AddEmployee>Филиппова Марианна Олеговна</plldrq:AddEmployee>\n" +
                "                                <plldrq:StartDate>2018-03-26T00:00:00Z</plldrq:StartDate>\n" +
                "                                <plldrq:EndDate>2020-03-26T00:00:00Z</plldrq:EndDate>\n" +
                "                            </plldrq:ProblemCriterion>\n" +
                "                        </plldrq:ProblemCriterionList>\n" +
                "                    </plldrq:ProblemGroupInfo>\n" +
                "                    \n" +
                "                    <plldrq:RiskSegmentInfo>\n" +
                "                        <plldrq:RiskSegment>Холдинговая компания</plldrq:RiskSegment>\n" +
                "                        <plldrq:ApprovalDate>2017-09-28T14:20:42Z</plldrq:ApprovalDate>\n" +
                "                        <plldrq:Comment>Изменено в ручном режиме в CRM. Подробная информация отражена на вкладке История изменений. Автоматическое обновление из BPM в рамках сделки 1-HMX604X</plldrq:Comment>\n" +
                "                    </plldrq:RiskSegmentInfo>\n" +
                "                    <plldrq:RatingList>\n" +
                "                        <plldrq:Rating>\n" +
                "                            <plldrq:Id>Rating6-oodefect</plldrq:Id>\n" +
                "                            <plldrq:Type>Rating</plldrq:Type>\n" +
                "                            <plldrq:Status>Actual</plldrq:Status>\n" +
                "                            <plldrq:Value>9</plldrq:Value>\n" +
                "                            <plldrq:Model>CC_RAS</plldrq:Model>\n" +
                "                            <plldrq:AddDate>2017-10-24</plldrq:AddDate>\n" +
                "                            <plldrq:ApprovalDate>2017-10-24T10:35:22Z</plldrq:ApprovalDate>\n" +
                "                            <plldrq:EmployeeLogin>Login</plldrq:EmployeeLogin>\n" +
                "                            <plldrq:EmployeeName>Вучечич Петр Прокопьевич</plldrq:EmployeeName>\n" +
                "                            <plldrq:TermDate>2017-10-25</plldrq:TermDate>\n" +
                "                            <plldrq:PD>0.348</plldrq:PD>\n" +
                "                            <plldrq:CalculatedRatingList>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Analyst</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMBABDAPLANDIA</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Иванов Геннадий Иванович</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-21T12:52:54Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>10</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Underwriter</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMRISKMANAGER1_TB1</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Иванов Геннадий Иванович</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-21T12:52:54Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>10</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                            </plldrq:CalculatedRatingList>\n" +
                "                        </plldrq:Rating>\n" +
                "                        <plldrq:Rating>\n" +
                "                            <plldrq:Id>Rating7-oodefect</plldrq:Id>\n" +
                "                            <plldrq:Type>Rating</plldrq:Type>\n" +
                "                            <plldrq:Status>Actual</plldrq:Status>\n" +
                "                            <plldrq:Value>13</plldrq:Value>\n" +
                "                            <plldrq:Model>PF_PROF_v2</plldrq:Model>\n" +
                "                            <plldrq:AddDate>2017-10-24</plldrq:AddDate>\n" +
                "                            <plldrq:ApprovalDate>2017-10-24T09:51:59Z</plldrq:ApprovalDate>\n" +
                "                            <plldrq:EmployeeLogin>Login</plldrq:EmployeeLogin>\n" +
                "                            <plldrq:EmployeeName>Вучечич Петр Прокопьевич</plldrq:EmployeeName>\n" +
                "                            <plldrq:TermDate>2017-10-25</plldrq:TermDate>\n" +
                "                            <plldrq:PD>1.253</plldrq:PD>\n" +
                "                            <plldrq:CalculatedRatingList>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Analyst</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMBABDAPLANDIA</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Иванов Геннадий Иванович</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-21T12:52:54Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>13</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Underwriter</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMRISKMANAGER1_TB1</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Иванов Геннадий Иванович</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-21T12:52:54Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>13</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                            </plldrq:CalculatedRatingList>\n" +
                "                        </plldrq:Rating>\n" +
                "                    </plldrq:RatingList>\n" +
                "                    <plldrq:MarkerInfo>\n" +
                "                        <plldrq:MarkerId>RMK2-oodefect</plldrq:MarkerId>\n" +
                "                        <plldrq:DebtCapacity>50000000</plldrq:DebtCapacity>\n" +
                "                        <plldrq:RatingId>RatingId0</plldrq:RatingId>\n" +
                "                        <plldrq:ReportingType>РСБУ</plldrq:ReportingType>\n" +
                "                        <plldrq:Status>Actual</plldrq:Status>\n" +
                "                        <plldrq:AppovalDate>2006-05-04T18:13:51.0Z</plldrq:AppovalDate>\n" +
                "                        <plldrq:ApprovalEmployeeLogin>ApprovalEmployeeLogin0</plldrq:ApprovalEmployeeLogin>\n" +
                "                        <plldrq:ApprovalEmployeeName>Сидоров Пал Палыч</plldrq:ApprovalEmployeeName>\n" +
                "                    </plldrq:MarkerInfo>\n" +
                "                    <plldrq:StopFactorList>\n" +
                "                        <plldrq:StopFactor>\n" +
                "                            <plldrq:Name>Менее 1 года с даты регистрации заемщика, кроме исключений: изменения наименования и/или реорганизации юридического лица (существующего более года), операция проектного финансирования (новое юрлицо),образование юридического лица на основании бизнеса индивидуального предпринимателя</plldrq:Name>\n" +
                "                            <plldrq:Comment>Комментарии отсутствуют</plldrq:Comment>\n" +
                "                        </plldrq:StopFactor>\n" +
                "                    </plldrq:StopFactorList>\n" +
                "                    <plldrq:RegistrationInfo>\n" +
                "                        <plldrq:RegistrationDate>2017-09-29</plldrq:RegistrationDate>\n" +
                "                        <plldrq:Authority>Орган регистрации</plldrq:Authority>\n" +
                "                        <plldrq:SertificateSeries>Серия 101, номер 123</plldrq:SertificateSeries>\n" +
                "                        <plldrq:IssueDate>2017-09-29</plldrq:IssueDate>\n" +
                "                    </plldrq:RegistrationInfo>\n" +
                "                    <plldrq:AddressList>\n" +
                "                        <plldrq:Address>\n" +
                "                            <plldrq:Type>Actual Address</plldrq:Type>\n" +
                "                            <plldrq:IsPrimary>true</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                            <plldrq:Country>Russian Federation</plldrq:Country>\n" +
                "                            <plldrq:City>Москва</plldrq:City>\n" +
                "                            <plldrq:Street>Волгоградский проспект</plldrq:Street>\n" +
                "                            <plldrq:House>10</plldrq:House>\n" +
                "                            <plldrq:PostIndex>123456</plldrq:PostIndex>\n" +
                "                        </plldrq:Address>\n" +
                "                    </plldrq:AddressList>\n" +
                "                    <plldrq:PhoneList>\n" +
                "                        <plldrq:Phone>\n" +
                "                            <plldrq:Type>Business</plldrq:Type>\n" +
                "                            <plldrq:Number>+7 (915) 6345645</plldrq:Number>\n" +
                "                            <plldrq:IsPrimary>true</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                            <plldrq:IsForSMS>true</plldrq:IsForSMS>\n" +
                "                        </plldrq:Phone>\n" +
                "                    </plldrq:PhoneList>\n" +
                "                    <plldrq:EmailAddressList>\n" +
                "                        <plldrq:Email>\n" +
                "                            <plldrq:Type>Business</plldrq:Type>\n" +
                "                            <plldrq:Address>wer@1111111111111.ru</plldrq:Address>\n" +
                "                            <plldrq:IsPrimary>true</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                        </plldrq:Email>\n" +
                "                    </plldrq:EmailAddressList>\n" +
                "                </plldrq:Organization>\n" +
                "                <plldrq:Organization>\n" +
                "                    <plldrq:ExtId>Org4-oodefect</plldrq:ExtId>\n" +
                "                    <plldrq:MDMOrgId>803506597443260637</plldrq:MDMOrgId>\n" +
                "                    <plldrq:OPF>IP</plldrq:OPF>\n" +
                "                    <plldrq:FullName>Пингвинчик</plldrq:FullName>\n" +
                "                    <plldrq:OrganizationType>Individual</plldrq:OrganizationType>\n" +
                "\t\t\t\t\t<plldrq:Category>Corp client</plldrq:Category>\n" +
                "                    <plldrq:CardOwnerLogin>TESTCRMMANAGER1</plldrq:CardOwnerLogin>\n" +
                "                    <plldrq:CardOwnerName>Шишкина Мария Евгеньевна</plldrq:CardOwnerName>\n" +
                "                    <plldrq:INN>470150955407</plldrq:INN>\n" +
                "                    <plldrq:OGRN>420843149410798</plldrq:OGRN>\n" +
                "                    <plldrq:OKPO>16330706</plldrq:OKPO>\n" +
                "                    <plldrq:Industry>Mechanical engineering</plldrq:Industry>\n" +
                "                    <plldrq:MacroIndustry>5</plldrq:MacroIndustry>\n" +
                "                    <plldrq:SubIndustry>5.16.3</plldrq:SubIndustry>\n" +
                "                    <plldrq:KindOfActivity>Судостроение</plldrq:KindOfActivity>\n" +
                "                    <plldrq:Segment>Average 2</plldrq:Segment>\n" +
                "                    <plldrq:OwnerId>Ind1-oodefect</plldrq:OwnerId>\n" +
                "                    <plldrq:Residency>Resident</plldrq:Residency>\n" +
                "                    <plldrq:KKFZ>true</plldrq:KKFZ>\n" +
                "                    <plldrq:NewLimitStructure>true</plldrq:NewLimitStructure>\n" +
                "                    <plldrq:EKInfo>\n" +
                "                        <plldrq:ExtId>EK4-oodefect</plldrq:ExtId>\n" +
                "                        <plldrq:MDMId>735850659774955503</plldrq:MDMId>\n" +
                "                        <plldrq:Name>GKP 28.09.17 14:12</plldrq:Name>\n" +
                "                        <plldrq:MainManagerLogin>TESTCRMKM4</plldrq:MainManagerLogin>\n" +
                "                        <plldrq:MainManagerName>TESTCRMKM4 TESTCRMKM4 undefined</plldrq:MainManagerName>\n" +
                "                    </plldrq:EKInfo>\n" +
                "                    <plldrq:RiskSegmentInfo>\n" +
                "                        <plldrq:RiskSegment>Тов.-сыр. фин-е (спец.кр.)</plldrq:RiskSegment>\n" +
                "                        <plldrq:ApprovalDate>2018-03-27T14:39:13Z</plldrq:ApprovalDate>\n" +
                "                        <plldrq:Comment>Изменено в ручном режиме в CRM. Подробная информация отражена на вкладке История изменений</plldrq:Comment>\n" +
                "                    </plldrq:RiskSegmentInfo>\n" +
                "                    <plldrq:RatingList>\n" +
                "                        <plldrq:Rating>\n" +
                "                            <plldrq:Id>Rating6-oodefect</plldrq:Id>\n" +
                "                            <plldrq:Type>Rating</plldrq:Type>\n" +
                "                            <plldrq:Status>Actual</plldrq:Status>\n" +
                "                            <plldrq:Value>9</plldrq:Value>\n" +
                "                            <plldrq:Model>CC_RAS</plldrq:Model>\n" +
                "                            <plldrq:AddDate>2017-10-24</plldrq:AddDate>\n" +
                "                            <plldrq:ApprovalDate>2017-10-24T10:35:22Z</plldrq:ApprovalDate>\n" +
                "                            <plldrq:EmployeeLogin>Login</plldrq:EmployeeLogin>\n" +
                "                            <plldrq:EmployeeName>Testcrmbabdaplandia Testcrmbabdaplandia Testcrmbabdaplandia</plldrq:EmployeeName>\n" +
                "                            <plldrq:TermDate>2017-10-25</plldrq:TermDate>\n" +
                "                            <plldrq:PD>0.348</plldrq:PD>\n" +
                "                            <plldrq:CalculatedRatingList>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Analyst</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMBABDAPLANDIA</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Иванов Геннадий Иванович</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-21T12:52:54Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>10</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Underwriter</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMRISKMANAGER1_TB1</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Иванов Геннадий Иванович</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-21T12:52:54Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_PRICE</plldrq:Name>\n" +
                "                                            <plldrq:Value>10</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>false</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>RATING_REZERV</plldrq:Name>\n" +
                "                                            <plldrq:Value>9</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                            </plldrq:CalculatedRatingList>\n" +
                "                        </plldrq:Rating>\n" +
                "                        <plldrq:Rating>\n" +
                "                            <plldrq:Id>Rating7-oodefect</plldrq:Id>\n" +
                "                            <plldrq:Type>Rating</plldrq:Type>\n" +
                "                            <plldrq:Status>Actual</plldrq:Status>\n" +
                "                            <plldrq:Value>13</plldrq:Value>\n" +
                "                            <plldrq:Model>PF_PROF_v2</plldrq:Model>\n" +
                "                            <plldrq:AddDate>2017-10-24</plldrq:AddDate>\n" +
                "                            <plldrq:ApprovalDate>2017-10-24T09:51:59Z</plldrq:ApprovalDate>\n" +
                "                            <plldrq:EmployeeLogin>Login</plldrq:EmployeeLogin>\n" +
                "                            <plldrq:EmployeeName>Testcrmbabdaplandia Testcrmbabdaplandia Testcrmbabdaplandia</plldrq:EmployeeName>\n" +
                "                            <plldrq:TermDate>2017-10-25</plldrq:TermDate>\n" +
                "                            <plldrq:PD>1.253</plldrq:PD>\n" +
                "                            <plldrq:CalculatedRatingList>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Analyst</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMBABDAPLANDIA</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Иванов Геннадий Иванович</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-21T12:52:54Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>13</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Underwriter</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMRISKMANAGER1_TB1</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Иванов Геннадий Иванович</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2017-12-04</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2017-12-21T12:52:54Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>13</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                            </plldrq:CalculatedRatingList>\n" +
                "                        </plldrq:Rating>\n" +
                "                    </plldrq:RatingList>\n" +
                "                    <plldrq:StopFactorList>\n" +
                "                        <plldrq:StopFactor>\n" +
                "                            <plldrq:Name>Просроченная задолженность перед Банком</plldrq:Name>\n" +
                "                            <plldrq:Comment>0</plldrq:Comment>\n" +
                "                        </plldrq:StopFactor>\n" +
                "                    </plldrq:StopFactorList>\n" +
                "                    <plldrq:RegistrationInfo>\n" +
                "                        <plldrq:RegistrationDate>2017-09-29</plldrq:RegistrationDate>\n" +
                "                        <plldrq:Authority>12</plldrq:Authority>\n" +
                "                        <plldrq:SertificateSeries>123</plldrq:SertificateSeries>\n" +
                "                        <plldrq:IssueDate>2017-10-02</plldrq:IssueDate>\n" +
                "                    </plldrq:RegistrationInfo>\n" +
                "                    <plldrq:AddressList>\n" +
                "                        <plldrq:Address>\n" +
                "                            <plldrq:Type>Actual Address</plldrq:Type>\n" +
                "                            <plldrq:IsPrimary>true</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                            <plldrq:Country>Antarctica</plldrq:Country>\n" +
                "                            <plldrq:City>фцв</plldrq:City>\n" +
                "                            <plldrq:Street>фцв</plldrq:Street>\n" +
                "                            <plldrq:House>фцв</plldrq:House>\n" +
                "                            <plldrq:PostIndex>фц</plldrq:PostIndex>\n" +
                "                        </plldrq:Address>\n" +
                "                    </plldrq:AddressList>\n" +
                "                    <plldrq:EmailAddressList>\n" +
                "                        <plldrq:Email>\n" +
                "                            <plldrq:Type>Personal Email</plldrq:Type>\n" +
                "                            <plldrq:Address>ert@wert.ru</plldrq:Address>\n" +
                "                            <plldrq:IsPrimary>true</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                        </plldrq:Email>\n" +
                "                    </plldrq:EmailAddressList>\n" +
                "                </plldrq:Organization>\n" +
                "            </plldrq:OrganizationList>\n" +
                "            <plldrq:ConsolidatedGroupList>\n" +
                "                <plldrq:ConsolidatedGroup>\n" +
                "                    <plldrq:ExtId>CG1-oodefect</plldrq:ExtId>\n" +
                "                    <plldrq:Name>КГ Солнышко</plldrq:Name>\n" +
                "                    <plldrq:RiskSegmentInfo>\n" +
                "                        <plldrq:RiskSegment>Тов.-сыр. фин-е (спец.кр.)</plldrq:RiskSegment>\n" +
                "                        <plldrq:ApprovalDate>2018-03-26T00:00:00Z</plldrq:ApprovalDate>\n" +
                "                        <plldrq:Comment>Изменено в ручном режиме в CRM</plldrq:Comment>\n" +
                "                    </plldrq:RiskSegmentInfo>\n" +
                "                    <plldrq:RatingList>\n" +
                "                        <plldrq:Rating>\n" +
                "                            <plldrq:Id>Rating8-oodefect</plldrq:Id>\n" +
                "                            <plldrq:Type>Rating</plldrq:Type>\n" +
                "                            <plldrq:Status>Actual</plldrq:Status>\n" +
                "                            <plldrq:Value>2</plldrq:Value>\n" +
                "                            <plldrq:Model>BNR</plldrq:Model>\n" +
                "                            <plldrq:AddDate>2018-01-18</plldrq:AddDate>\n" +
                "                            <plldrq:ApprovalDate>2018-01-18T11:03:01Z</plldrq:ApprovalDate>\n" +
                "                            <plldrq:EmployeeLogin>TESTCRMBABDAPLANDIA</plldrq:EmployeeLogin>\n" +
                "                            <plldrq:EmployeeName>Testcrmbabdaplandia Testcrmbabdaplandia Testcrmbabdaplandia</plldrq:EmployeeName>\n" +
                "                            <plldrq:TermDate>2018-01-19</plldrq:TermDate>\n" +
                "                            <plldrq:PD>0.037</plldrq:PD>\n" +
                "                            <plldrq:CalculatedRatingList>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Analyst</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMBABDAPLANDIA</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Testcrmbabdaplandia Testcrmbabdaplandia Testcrmbabdaplandia</plldrq:OperatorName>\n" +
                "                                    <plldrq:CalculationDate>2018-01-18</plldrq:CalculationDate>\n" +
                "                                    <plldrq:UpdateDate>2018-01-18T11:00:29Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>2</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                                <plldrq:CalculatedRating>\n" +
                "                                    <plldrq:RoleId>Underwriter</plldrq:RoleId>\n" +
                "                                    <plldrq:OperatorId>TESTCRMRISKMANAGER1</plldrq:OperatorId>\n" +
                "                                    <plldrq:OperatorName>Testcrmriskmanager1 Testcrmriskmanager1 Testcrmriskmanager1</plldrq:OperatorName>\n" +
                "                                    <plldrq:UpdateDate>2018-01-18T11:03:01Z</plldrq:UpdateDate>\n" +
                "                                    <plldrq:CalculatedValueList>\n" +
                "                                        <plldrq:CalculatedValue>\n" +
                "                                            <plldrq:MainValue>true</plldrq:MainValue>\n" +
                "                                            <plldrq:Name>Rw</plldrq:Name>\n" +
                "                                            <plldrq:Value>2</plldrq:Value>\n" +
                "                                        </plldrq:CalculatedValue>\n" +
                "                                    </plldrq:CalculatedValueList>\n" +
                "                                </plldrq:CalculatedRating>\n" +
                "                            </plldrq:CalculatedRatingList>\n" +
                "                        </plldrq:Rating>\n" +
                "                    </plldrq:RatingList>\n" +
                "                </plldrq:ConsolidatedGroup>\n" +
                "            </plldrq:ConsolidatedGroupList>\n" +
                "            <plldrq:IndividualList>\n" +
                "                <plldrq:Individual>\n" +
                "                    <plldrq:ExtId>Ind1-oodefect</plldrq:ExtId>\n" +
                "                    <plldrq:LastName>Лапочкина</plldrq:LastName>\n" +
                "                    <plldrq:FirstName>Анна</plldrq:FirstName>\n" +
                "                    <plldrq:MiddleName>Семеновна</plldrq:MiddleName>\n" +
                "                    <plldrq:DateOfBirth>1976-08-01</plldrq:DateOfBirth>\n" +
                "                    <plldrq:PlaceOfBirth>Москва</plldrq:PlaceOfBirth>\n" +
                "                    <plldrq:Gender>F</plldrq:Gender>\n" +
                "                    <plldrq:IsResident>false</plldrq:IsResident>\n" +
                "                    <plldrq:AddressList>\n" +
                "                        <plldrq:Address>\n" +
                "                            <plldrq:Type>Staff Apartment</plldrq:Type>\n" +
                "                            <plldrq:IsPrimary>true</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                            <plldrq:Country>Турция</plldrq:Country>\n" +
                "                            <plldrq:City>г. Стамбул</plldrq:City>\n" +
                "                            <plldrq:Street>ул. Пушкина</plldrq:Street>\n" +
                "                            <plldrq:House>д. 7</plldrq:House>\n" +
                "                            <plldrq:PostIndex>6000315</plldrq:PostIndex>\n" +
                "                        </plldrq:Address>\n" +
                "                    </plldrq:AddressList>\n" +
                "                    <plldrq:DocumentList>\n" +
                "                        <plldrq:Document>\n" +
                "                            <plldrq:Type>39</plldrq:Type>\n" +
                "                            <plldrq:Series>00</plldrq:Series>\n" +
                "                            <plldrq:Number>12345</plldrq:Number>\n" +
                "                            <plldrq:IssueDate>1986-06-11</plldrq:IssueDate>\n" +
                "                            <plldrq:IssueSubdivisionCode>500-770</plldrq:IssueSubdivisionCode>\n" +
                "                            <plldrq:IssueSubdivision>ОУФМС</plldrq:IssueSubdivision>\n" +
                "                        </plldrq:Document>\n" +
                "                        <plldrq:Document>\n" +
                "                            <plldrq:Type>1</plldrq:Type>\n" +
                "                            <plldrq:Series>2507</plldrq:Series>\n" +
                "                            <plldrq:Number>973401</plldrq:Number>\n" +
                "                            <plldrq:IssueDate>1986-05-11</plldrq:IssueDate>\n" +
                "                            <plldrq:IssueSubdivisionCode>500-770</plldrq:IssueSubdivisionCode>\n" +
                "                            <plldrq:IssueSubdivision>УФМС России по Иркутской области, Свердловского р-на гор. Иркутск</plldrq:IssueSubdivision>\n" +
                "                        </plldrq:Document>\n" +
                "                    </plldrq:DocumentList>\n" +
                "                </plldrq:Individual>\n" +
                "                <plldrq:Individual>\n" +
                "                    <plldrq:ExtId>Ind2-oodefect</plldrq:ExtId>\n" +
                "                    <plldrq:LastName>Грозный</plldrq:LastName>\n" +
                "                    <plldrq:FirstName>Степан</plldrq:FirstName>\n" +
                "                    <plldrq:MiddleName>Кондратьевич</plldrq:MiddleName>\n" +
                "                    <plldrq:DateOfBirth>1976-08-01</plldrq:DateOfBirth>\n" +
                "                    <plldrq:PlaceOfBirth>Москва</plldrq:PlaceOfBirth>\n" +
                "                    <plldrq:Gender>M</plldrq:Gender>\n" +
                "                    <plldrq:AddressList>\n" +
                "                        <plldrq:Address>\n" +
                "                            <plldrq:Type>Actual Address</plldrq:Type>\n" +
                "                            <plldrq:IsPrimary>true</plldrq:IsPrimary>\n" +
                "                            <plldrq:IsActual>true</plldrq:IsActual>\n" +
                "                            <plldrq:Country>United Kingdom</plldrq:Country>\n" +
                "                            <plldrq:City>г. Эдинбруг</plldrq:City>\n" +
                "                            <plldrq:Street>ул. Первая</plldrq:Street>\n" +
                "                            <plldrq:House>д. 1</plldrq:House>\n" +
                "                            <plldrq:PostIndex>60003</plldrq:PostIndex>\n" +
                "                        </plldrq:Address>\n" +
                "                    </plldrq:AddressList>\n" +
                "                    <plldrq:DocumentList>\n" +
                "                        <plldrq:Document>\n" +
                "                            <plldrq:Type>39</plldrq:Type>\n" +
                "                            <plldrq:Series>00</plldrq:Series>\n" +
                "                            <plldrq:Number>12345</plldrq:Number>\n" +
                "                            <plldrq:IssueDate>1986-06-11</plldrq:IssueDate>\n" +
                "                            <plldrq:IssueSubdivisionCode>некий код</plldrq:IssueSubdivisionCode>\n" +
                "                            <plldrq:IssueSubdivision>ОУФМС</plldrq:IssueSubdivision>\n" +
                "                        </plldrq:Document>\n" +
                "                        <plldrq:Document>\n" +
                "                            <plldrq:Type>1</plldrq:Type>\n" +
                "                            <plldrq:Series>11</plldrq:Series>\n" +
                "                            <plldrq:Number>67890</plldrq:Number>\n" +
                "                            <plldrq:IssueDate>1986-05-11</plldrq:IssueDate>\n" +
                "                            <plldrq:IssueSubdivision>Орган Develop</plldrq:IssueSubdivision>\n" +
                "                        </plldrq:Document>\n" +
                "                    </plldrq:DocumentList>\n" +
                "                </plldrq:Individual>\n" +
                "            </plldrq:IndividualList>\n" +
                "        </plldrq:PutLegalLoanDealRq>\n" +
                "    </ns1:Body>\n" +
                "</ns1:Envelope>");



return a;
}


}
