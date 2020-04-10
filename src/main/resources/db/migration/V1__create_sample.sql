CREATE TABLE `sample`
(
    `id`          int(11)     NOT NULL AUTO_INCREMENT,
    `name`        varchar(50) NOT NULL,
    `description` varchar(255) DEFAULT NULL,
    `start_date`  date        NOT NULL,
    `end_date`    date         DEFAULT NULL,
    PRIMARY KEY (`id`)
)