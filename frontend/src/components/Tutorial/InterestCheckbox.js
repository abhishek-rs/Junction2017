import React from 'react';
import Checkbox from 'material-ui/Checkbox';
import ActionFavorite from 'material-ui/svg-icons/action/favorite';
import ActionFavoriteBorder from 'material-ui/svg-icons/action/favorite-border';

const styles = {
  block: {
    maxWidth: 250,
  },
  checkbox: {
    marginLeft: 16,
    color: 'white !important',
    borderColor: 'red',
  },
};

class InterestCheckbox extends React.Component {
  state = {
    checked: false,
  }

  updateCheck() {
    this.setState((oldState) => {
      return {
        checked: !oldState.checked,
      };
    });
  }

  render() {
    return (
      <div style={styles.block}>
        <Checkbox
          checkedIcon={<ActionFavorite />}
          uncheckedIcon={<ActionFavoriteBorder />}
          style={styles.checkbox}
          labelStyle={{color: 'white'}} iconStyle={{fill: 'white'}}
        />
      </div>
    );
  }
}

export default InterestCheckbox;
