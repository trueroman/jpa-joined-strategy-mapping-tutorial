CREATE DATABASE jpa_joined_strategy_mapping_tutorial;
USE jpa_joined_strategy_mapping_tutorial;

CREATE TABLE releases (
release_id INT PRIMARY KEY,
release_name VARCHAR(50),
release_year INT,
release_length VARCHAR(10),
release_type VARCHAR(10)
);

CREATE TABLE video_releases (
release_id INT PRIMARY KEY,
video_release_type VARCHAR(10),
FOREIGN KEY (release_id) references releases (release_id)
);

CREATE TABLE cd_releases (
release_id INT PRIMARY KEY,
cd_release_number_of_tracks INT,
cd_release_type VARCHAR(10),
FOREIGN KEY (release_id) references releases (release_id)
);

CREATE TABLE mp3_releases (
release_id INT PRIMARY KEY,
mp3_release_number_of_tracks INT,
mp3_release_bitrate INT,
FOREIGN KEY (release_id) references releases (release_id)
);

INSERT INTO releases VALUES (1, 'Live on the Other Side', 2005, '01:18:21', 'Video');
INSERT INTO releases VALUES (2, 'Live at Montreux 2004', 2008, '01:14:54', 'Video');
INSERT INTO releases VALUES (3, 'Take a Look in the Mirror', 2003, '00:56:43', 'CD');
INSERT INTO releases VALUES (4, 'See You on the Other Side', 2005, '01:01:01', 'CD');
INSERT INTO releases VALUES (5, 'The Paradigm Shift', 2013, '00:49:00', 'MP3');

INSERT INTO video_releases VALUES (1, 'DVD');
INSERT INTO video_releases VALUES (2, 'BD');

INSERT INTO cd_releases VALUES (3, 13, 'AUDIO_CD');
INSERT INTO cd_releases VALUES (4, 14, 'SACD');

INSERT INTO mp3_releases VALUES (5, 13, 320);