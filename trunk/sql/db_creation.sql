SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';


-- -----------------------------------------------------
-- Table `forms_template`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `forms_template` ;

CREATE  TABLE IF NOT EXISTS `forms_template` (
  `form_id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NULL ,
  `url` MEDIUMTEXT NULL ,
  PRIMARY KEY (`form_id`) )
ENGINE = MyISAM;


-- -----------------------------------------------------
-- Table `form_fields_template`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `form_fields_template` ;

CREATE  TABLE IF NOT EXISTS `form_fields_template` (
  `form_fields_id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NULL ,
  `form_id` INT NOT NULL ,
  `default_value` VARCHAR(45) NULL ,
  PRIMARY KEY (`form_fields_id`, `form_id`) ,
  CONSTRAINT `form_fileds`
    FOREIGN KEY (`form_id` )
    REFERENCES `forms_template` (`form_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = MyISAM;

CREATE INDEX `form_fileds` ON `form_fields_template` (`form_id` ASC) ;


-- -----------------------------------------------------
-- Table `Form_instance`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Form_instance` ;

CREATE  TABLE IF NOT EXISTS `Form_instance` (
  `form_instance_id` INT NOT NULL AUTO_INCREMENT ,
  `creation_date` DATE NOT NULL ,
  `form_id` INT NOT NULL ,
  `update_date` DATE NULL ,
  PRIMARY KEY (`form_id`, `form_instance_id`) ,
  CONSTRAINT `instance_of_form`
    FOREIGN KEY (`form_id` )
    REFERENCES `forms_template` (`form_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = MyISAM;

CREATE INDEX `instance_of_form` ON `Form_instance` (`form_id` ASC) ;


-- -----------------------------------------------------
-- Table `form_fields_instance`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `form_fields_instance` ;

CREATE  TABLE IF NOT EXISTS `form_fields_instance` (
  `form_field_instance_id` INT NOT NULL AUTO_INCREMENT ,
  `form_field_id` INT NOT NULL ,
  `form_id` INT NOT NULL ,
  `form_instance_id` INT NOT NULL ,
  `text` MEDIUMTEXT NULL ,
  PRIMARY KEY (`form_field_instance_id`, `form_field_id`, `form_id`, `form_instance_id`) ,
  CONSTRAINT `form_field_instances`
    FOREIGN KEY (`form_field_id` , `form_id` )
    REFERENCES `form_fields_template` (`form_fields_id` , `form_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fields_of_form_instance`
    FOREIGN KEY (`form_instance_id` )
    REFERENCES `Form_instance` (`form_instance_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = MyISAM;

CREATE INDEX `form_field_instances` ON `form_fields_instance` (`form_field_id` ASC, `form_id` ASC) ;

CREATE INDEX `fields_of_form_instance` ON `form_fields_instance` (`form_instance_id` ASC) ;


-- -----------------------------------------------------
-- Table `parameters`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `parameters` ;

CREATE  TABLE IF NOT EXISTS `parameters` (
  `parameter_id` INT NOT NULL AUTO_INCREMENT ,
  `value` VARCHAR(45) NULL ,
  PRIMARY KEY (`parameter_id`) )
ENGINE = MyISAM;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
