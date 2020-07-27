CREATE DATABASE "TouristHint";
CREATE USER tourist_hint_bot_admin WITH PASSWORD 'admin';

CREATE TABLE city(
	PRIMARY KEY (city_id),
    city_id   SERIAL,
    city_name VARCHAR(25) NOT NULL,
	hint      TEXT        NOT NULL,
	UNIQUE (city_name)			  
);

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO tourist_hint_bot_admin;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO tourist_hint_bot_admin;

INSERT INTO city(city_name, hint) VALUES ('брест', 'Вам будет интересно сходить на улицу Советскую, главную пешеходную улицу города. Там вы найдете многочисленные уютные кафе и рестораны. Рекомендуем вам остаться там, по крайней мере, до заката, поскольку тогда у вас будет возможность увидеть знаменитого фонарщика, который каждый вечер зажигает красивые керосиновые фонари на улице Советской. Только после того, как он закончит свою процедуру, загорается свет во всем городе. То, что обязательно сделать каждый турист в Бресте, –  это сфотографироваться с ним.');
INSERT INTO city(city_name, hint) VALUES ('несвиж', 'Главная достопримечательность Несвижа и причина, почему так много туристов приезжают сюда, – это знаменитый Несвижский замок. Богатая семья Радзивиллов владела замком, а также несколькими другими, такими как близлежащим Мирским замком. Замок окружен рвом и красивым парком, по которому вы можете совершить долгую и приятную прогулку, наслаждаясь спокойствием и красотой природы. Сам город небольшой, но также имеет интересные достопримечательности. Идите на главную городскую площадь и покатайтесь в карете, чувствуя себя средневековым принцем или принцессой. Вы также можете посетить некоторые из красивых церквей Несвижа, и остановиться в отеле на главной площади.');
INSERT INTO city(city_name, hint) VALUES ('полоцк', 'Главной достопримечательностью города является Полоцкий Софийский собор, благодаря которому город является религиозной меккой Беларуси. Среди других достопримечательностей в Полоцке стоит выделить знак, обозначающий географический центр Европы, где вы также можете получить сертификат, что вы были в «Центре Европы», памятник буквы «Ў» (единственная буква, которая есть только в белорусском алфавите), Борисов камень, окруженный легендами, и многочисленные церкви.');
INSERT INTO city(city_name, hint) VALUES ('гродно', 'В Гродно огромный выбор достопримечательностей, которые стоит посетить. Сходите в аптеку-музей, погуляйте по старому городу и городским паркам. Вы можете найти несколько старых зданий со времен, когда здесь правили Польша, а также некоторые более новые со времен Российской империи и СССР. Здесь можно также увидеть множество красивый церквей различных религий.');
INSERT INTO city(city_name, hint) VALUES ('пинск', 'Пинск – один из старейших городов Беларуси, многие из исторических достопримечательностей которого, к счастью, сохранились до наших дней. Он является вторым городом Беларуси по количеству старинных архитектурных памятников, сохранившихся до сегодняшнего дня. Прогуляйтесь по чистым улицам Пинска и насладитесь яркими домиками этого тихого города. Здесь вы также найдете множество красивых церквей, которые могут вас поразить.');
INSERT INTO city(city_name, hint) VALUES ('витебск', 'Прогуляйтесь по живописным берегам двух рек, протекающих в Витебске, Западной Двине и Витьбе, посетите православные церкви города, выберите себе несколько интересных музеев для посещения, как, например, музей Трамвая, и купите билет на знаменитый фестиваль культуры Славянский базар, организованный здесь каждый год.');
INSERT INTO city(city_name, hint) VALUES ('новогрудок', 'Естественно, как и многие другие города Беларуси в нашем списке, Новогрудок имеет свой замок. Или, что-то, что раньше было замком, а теперь восстанавливается. Несмотря на то, что здание не сохранилось до наших дней, вы можете представить себе величие замка, который использовался для защиты земли от захватчиков.');
INSERT INTO city(city_name, hint) VALUES ('гомель', 'Основные достопримечательности города расположены недалеко друг от друга, в центре Гомеля. Главная достопримечательность – дворец Румянцевых-Паскевичей с окружающим его парком, несколькими музеями, охотничьим домиком и живописным берегом реки Сож.');
INSERT INTO city(city_name, hint) VALUES ('слоним', 'Слоним – небольшой городок в Гродненской области, где расположены многие из главных белорусских достопримечательностей, в том числе другие древние города, Августовский канал и многие белорусские замки. В самом городе интересно будет посетить его синагогу, Андреевскую церковь, «бездонное озеро», окруженное многочисленными легендами, усадьбу графов Пусловских, и даже железнодорожная станция Слонима заслуживает вашего внимания.');