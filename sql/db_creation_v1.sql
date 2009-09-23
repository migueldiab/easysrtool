SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `mydb`;

-- -----------------------------------------------------
-- Table `mydb`.`forms_tamplate`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`forms_tamplate` (
  `form_id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NULL ,
  `url` MEDIUMTEXT NULL ,
  PRIMARY KEY (`form_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`form_fields_template`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`form_fields_template` (
  `form_fields_id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NULL ,
  `form_id` INT NOT NULL ,
  `default_value` VARCHAR(45) NULL ,
  PRIMARY KEY (`form_fields_id`, `form_id`) ,
  INDEX `form_fileds` (`form_id` ASC) ,
  CONSTRAINT `form_fileds`
    FOREIGN KEY (`form_id` )
    REFERENCES `mydb`.`forms_tamplate` (`form_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Form_instance`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`Form_instance` (
  `form_instance_id` INT NOT NULL AUTO_INCREMENT ,
  `creation_date` DATE NOT NULL ,
  `form_id` INT NOT NULL AUTO_INCREMENT ,
  `update_date` DATE NULL ,
  PRIMARY KEY (`form_id`, `form_instance_id`) ,
  INDEX `instance_of_form` (`form_id` ASC) ,
  CONSTRAINT `instance_of_form`
    FOREIGN KEY (`form_id` )
    REFERENCES `mydb`.`forms_tamplate` (`form_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`form_fields_instance`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`form_fields_instance` (
  `form_field_instance_id` INT NOT NULL AUTO_INCREMENT ,
  `form_field_id` INT NOT NULL ,
  `form_id` INT NOT NULL ,
  `form_instance_id` INT NOT NULL ,
  `text` MEDIUMTEXT NULL ,
  PRIMARY KEY (`form_field_instance_id`, `form_field_id`, `form_id`, `form_instance_id`) ,
  INDEX `form_field_instances` (`form_field_id` ASC, `form_id` ASC) ,
  INDEX `fields_of_form_instance` (`form_instance_id` ASC) ,
  CONSTRAINT `form_field_instances`
    FOREIGN KEY (`form_field_id` , `form_id` )
    REFERENCES `mydb`.`form_fields_template` (`form_fields_id` , `form_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fields_of_form_instance`
    FOREIGN KEY (`form_instance_id` )
    REFERENCES `mydb`.`Form_instance` (`form_instance_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`parameters`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `mydb`.`parameters` (
  `parameter_id` INT NOT NULL AUTO_INCREMENT ,
  `value` VARCHAR(45) NULL ,
  PRIMARY KEY (`parameter_id`) )
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
