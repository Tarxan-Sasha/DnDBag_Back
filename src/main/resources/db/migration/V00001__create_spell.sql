create table spell (
    id_spell serial primary key,
    name_spell varchar(50),
    component_v varchar(1),
    component_s varchar(1),
    component_m varchar(120),
    duration_spell varchar(15),
    distance_spell varchar(15),
    time_of_application_spell varchar(50),
    description_spell text

)